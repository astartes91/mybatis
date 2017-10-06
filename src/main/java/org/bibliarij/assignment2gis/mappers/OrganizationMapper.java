package org.bibliarij.assignment2gis.mappers;

import org.apache.ibatis.annotations.Mapper;
import org.bibliarij.assignment2gis.entities.Organization;

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
     * Insert phone for organization
     * @param phone
     * @param organizationId
     */
    void insertPhone(String phone, Long organizationId);

    /**
     * Delete phone from organization
     * @param phone
     * @param organizationId
     */
    void deletePhone(String phone, Long organizationId);
}
