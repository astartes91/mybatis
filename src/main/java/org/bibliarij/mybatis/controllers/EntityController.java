package org.bibliarij.mybatis.controllers;

import com.google.common.base.Preconditions;
import io.swagger.annotations.ApiOperation;
import org.bibliarij.mybatis.entities.Entity;
import org.bibliarij.mybatis.services.EntityService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Spring REST controller for generic entity
 * @param <T>
 */
public abstract class EntityController<T extends Entity> {

    /**
     * REST endpoint for getting all entities
     * @return
     */
    @ApiOperation("Get all entities")
    @RequestMapping(method = RequestMethod.GET)
    public List<T> getAllEntities(){
        return getService().getAllEntities();
    }

    /**
     * REST endpoint for getting entity by id
     * @param id
     * @return
     */
    @ApiOperation("Get entity by id")
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public T get(@PathVariable Long id){
        return getService().get(id);
    }

    /**
     * REST endpoint for entity creation
     * @return
     * @param entity
     */
    @ApiOperation("Entity creation")
    @RequestMapping(method = RequestMethod.POST)
    public T create(@RequestBody T entity){
        getService().create(entity);
        return entity;
    }

    /**
     * REST endpoint for entities' batch creation
     * @return
     * @param entities
     */
    @ApiOperation("Entities' batch creation")
    @RequestMapping(method = RequestMethod.POST, value = "/list")
    public List<T> create(@RequestBody List<T> entities){
        getService().create(entities);
        return entities;
    }

    /**
     * REST endpoint for entity update
     * @return
     * @param entity
     */
    @ApiOperation("Entity update")
    @RequestMapping(method = RequestMethod.PUT, value = "/{id}")
    public T update(@PathVariable Long id, @RequestBody T entity){

        Preconditions.checkArgument(
                id != null
                        && entity.getId() != null
                        && id.equals(entity.getId())
                        && getService().get(id) != null,
                "Id is not correct!"
        );

        getService().update(entity);
        return entity;
    }

    /**
     * Get instance of service
     * @return
     */
    protected abstract EntityService<T> getService();
}
