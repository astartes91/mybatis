package org.bibliarij.mybatis.controllers;

import io.swagger.annotations.Api;
import org.bibliarij.mybatis.entities.Street;
import org.bibliarij.mybatis.services.EntityService;
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
     * Get instance of service
     * @return
     */
    @Override
    public EntityService<Street> getService() {
        return service;
    }
}
