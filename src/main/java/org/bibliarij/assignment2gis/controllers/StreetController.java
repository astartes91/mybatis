package org.bibliarij.assignment2gis.controllers;

import io.swagger.annotations.Api;
import org.bibliarij.assignment2gis.entities.Street;
import org.bibliarij.assignment2gis.services.EntityService;
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
    private EntityService<Street> service;

    /**
     * Get instance of mapper
     * @return
     */
    @Override
    public EntityService<Street> getService() {
        return service;
    }
}
