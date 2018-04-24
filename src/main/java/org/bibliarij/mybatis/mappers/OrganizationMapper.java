package org.bibliarij.mybatis.mappers;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.bibliarij.mybatis.entities.Organization;

import java.time.LocalDateTime;
import java.util.List;

/**
 * MyBatis mapper for {@link Organization} entity
 */
@Mapper
public interface OrganizationMapper extends EntityMapper<Organization> {

    /**
     * Get organizations by name
     * @param name
     * @return
     */
    List<Organization> getByName(String name);

    /**
     * Get organizations by creation/update date-time
     * @param creationUpdateDateTime
     * @return
     */
    List<Organization> getByCreationUpdateDateTime(LocalDateTime creationUpdateDateTime);

    /**
     * Insert phone for organization
     * @param phone
     * @param organizationId
     */
    void insertPhone(@Param("phone") String phone, @Param("organizationId") Long organizationId);

    /**
     * Delete phone from organization
     * @param phone
     * @param organizationId
     */
    void deletePhone(@Param("phone") String phone, @Param("organizationId") Long organizationId);
}
