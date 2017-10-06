package org.bibliarij.assignment2gis.controllers;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.bibliarij.assignment2gis.entities.Organization;
import org.bibliarij.assignment2gis.services.EntityService;
import org.bibliarij.assignment2gis.services.OrganizationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Spring REST Controller for {@link Organization} entity
 */
@RestController
@RequestMapping("/organizations")
@Api("REST Controller for Organization entity")
public class OrganizationController extends EntityController<Organization> {

    @Autowired
    private OrganizationService service;

    /**
     * REST endpoint for getting organizations by name
     * @param name
     * @return
     */
    @ApiOperation("Get organizations by name")
    @RequestMapping(method = RequestMethod.GET, value = "/by-name/{name}")
    public List<Organization> get(@PathVariable String name){
        return service.get(name);
    }

    /**
     * Get instance of service
     * @return
     */
    @Override
    public EntityService<Organization> getService() {
        return service;
    }
}
