package org.bibliarij.mybatis.services;

import org.bibliarij.mybatis.entities.Entity;
import org.bibliarij.mybatis.mappers.EntityMapper;

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
    public T get(Long id) {
        return getMapper().get(id);
    }

    /**
     * Insert entity
     *
     * @param entity
     */
    @Override
    public void create(T entity) {
        getMapper().insert(entity);
    }

    /**
     * Insert entities
     *
     * @param entities
     */
    @Override
    public void create(List<T> entities) {
        entities.forEach(this::create);
    }

    /**
     * Update entity
     *
     * @param entity
     */
    @Override
    public void update(T entity) {
        getMapper().update(entity);
    }

    /**
     * Get instance of mapper
     * @return
     */
    protected abstract EntityMapper<T> getMapper();
}
