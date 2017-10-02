package org.bibliarij.assignment2gis.mappers;

import org.apache.ibatis.annotations.Mapper;
import org.bibliarij.assignment2gis.entities.Organization;

/**
 * MyBatis mapper for {@link Organization} entity
 */
@Mapper
public interface OrganizationMapper extends EntityMapper<Organization> {
}
