package org.bibliarij.mybatis.mappers;

import org.apache.ibatis.annotations.Mapper;
import org.bibliarij.mybatis.entities.Street;

/**
 * MyBatis mapper for {@link Street} entity
 */
@Mapper
public interface StreetMapper extends EntityMapper<Street> {
}
