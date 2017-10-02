package org.bibliarij.assignment2gis.services;

import org.bibliarij.assignment2gis.entities.Organization;
import org.bibliarij.assignment2gis.mappers.EntityMapper;
import org.bibliarij.assignment2gis.mappers.OrganizationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrganizationServiceImpl extends EntityServiceImpl<Organization> {

    @Autowired
    private OrganizationMapper mapper;

    /**
     * Get instance of mapper
     *
     * @return
     */
    @Override
    protected EntityMapper<Organization> getMapper() {
        return mapper;
    }
}
