package org.bibliarij.assignment2gis.controllers;

import io.swagger.annotations.Api;
import org.bibliarij.assignment2gis.entities.Street;
import org.bibliarij.assignment2gis.mappers.EntityMapper;
import org.bibliarij.assignment2gis.mappers.StreetMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Spring REST Controller for {@link Street} entity
 */
@RestController
@RequestMapping("/streets")
@Api("REST Controller for Street entity")
public class StreetController extends EntityController<Street> {

    @Autowired
    private StreetMapper streetMapper;

    @Override
    public EntityMapper<Street> getMapper() {
        return streetMapper;
    }
}
