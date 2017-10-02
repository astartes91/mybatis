package org.bibliarij.assignment2gis.controllers;

import io.swagger.annotations.Api;
import org.bibliarij.assignment2gis.entities.Organization;
import org.bibliarij.assignment2gis.services.EntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Spring REST Controller for {@link Organization} entity
 */
@RestController
@RequestMapping("/organizations")
@Api("REST Controller for Organization entity")
public class OrganizationController extends EntityController<Organization> {

    @Autowired
    private EntityService<Organization> service;

    /**
     * Get instance of mapper
     * @return
     */
    @Override
    public EntityService<Organization> getService() {
        return service;
    }
}
