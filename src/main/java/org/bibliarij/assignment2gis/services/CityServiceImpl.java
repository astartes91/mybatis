package org.bibliarij.assignment2gis.services;

import org.bibliarij.assignment2gis.entities.City;
import org.bibliarij.assignment2gis.mappers.CityMapper;
import org.bibliarij.assignment2gis.mappers.EntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
