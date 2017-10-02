package org.bibliarij.assignment2gis.services;

import org.bibliarij.assignment2gis.entities.Entity;
import org.bibliarij.assignment2gis.mappers.EntityMapper;

import java.util.List;

/**
 * Service for generic entity
 * @param <T>
 */
public abstract class EntityServiceImpl<T extends Entity> implements EntityService<T> {

    /**
     * Get all entities
     *
     * @return
     */
    @Override
    public List<T> getAllEntities() {
        return getMapper().getAllEntities();
    }

    /**
     * Get entity by id
     *
     * @param id
     * @return
     */
    @Override
    public T getEntity(Long id) {
        return getMapper().getEntity(id);
    }

    /**
     * Insert entity
     *
     * @param entity
     */
    @Override
    public void insertEntity(T entity) {
        getMapper().insertEntity(entity);
    }

    /**
     * Update entity
     *
     * @param entity
     */
    @Override
    public void updateEntity(T entity) {
        getMapper().updateEntity(entity);
    }

    /**
     * Get instance of mapper
     * @return
     */
    protected abstract EntityMapper<T> getMapper();
}
