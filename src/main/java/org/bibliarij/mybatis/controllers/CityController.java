package org.bibliarij.mybatis.controllers;

import io.swagger.annotations.Api;
import org.bibliarij.mybatis.entities.City;
import org.bibliarij.mybatis.services.EntityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Spring REST Controller for {@link City} entity
 */
@RestController
@RequestMapping("/cities")
@Api("REST Controller for City entity")
public class CityController extends EntityController<City> {

    @Autowired
    private EntityService<City> service;

    /**
     * Get instance of service
     * @return
     */
    @Override
    public EntityService<City> getService() {
        return service;
    }
}
