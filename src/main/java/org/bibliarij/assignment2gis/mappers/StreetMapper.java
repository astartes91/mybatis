package org.bibliarij.assignment2gis.mappers;

import org.apache.ibatis.annotations.Mapper;
import org.bibliarij.assignment2gis.entities.Street;

/**
 * MyBatis mapper for {@link Street} entity
 */
@Mapper
public interface StreetMapper extends EntityMapper<Street> {
}
