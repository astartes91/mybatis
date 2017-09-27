package org.bibliarij.assignment2gis.mappers;

import org.apache.ibatis.annotations.Mapper;
import org.bibliarij.assignment2gis.entities.City;

/**
 * MyBatis mapper for {@link City} entity
 */
@Mapper
public interface CityMapper extends EntityMapper<City> {

}
