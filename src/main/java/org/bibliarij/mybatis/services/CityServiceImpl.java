package org.bibliarij.mybatis.services;

import org.bibliarij.mybatis.entities.City;
import org.bibliarij.mybatis.mappers.CityMapper;
import org.bibliarij.mybatis.mappers.EntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Service for {@link City} entity
 */
@Service
public class CityServiceImpl extends EntityServiceImpl<City> {

    @Autowired
    private CityMapper mapper;

    /**
     * Get instance of mapper
     *
     * @return
     */
    @Override
    protected EntityMapper<City> getMapper() {
        return mapper;
    }
}
