package org.bibliarij.assignment2gis.mappers;

import org.apache.ibatis.annotations.Mapper;
import org.bibliarij.assignment2gis.entities.Organization;

/**
 * MyBatis mapper for {@link Organization} entity
 */
@Mapper
public interface OrganizationMapper extends EntityMapper<Organization> {

    /**
     * Insert phone for organization
     * @param phone
     * @param organizationId
     */
    void insertPhone(String phone, Long organizationId);
}
