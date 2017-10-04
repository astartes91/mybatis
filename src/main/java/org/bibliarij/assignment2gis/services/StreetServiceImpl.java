package org.bibliarij.assignment2gis.services;

import org.bibliarij.assignment2gis.entities.Street;
import org.bibliarij.assignment2gis.mappers.EntityMapper;
import org.bibliarij.assignment2gis.mappers.StreetMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Service for {@link Street} entity
 */
@Service
public class StreetServiceImpl extends EntityServiceImpl<Street> {

    @Autowired
    private StreetMapper mapper;

    /**
     * Get instance of mapper
     *
     * @return
     */
    @Override
    protected EntityMapper<Street> getMapper() {
        return mapper;
    }
}
