package org.bibliarij.assignment2gis.services;

import org.bibliarij.assignment2gis.entities.Entity;

import java.util.List;

/**
 * Service for generic entity
 * @param <T>
 */
public interface EntityService<T extends Entity>  {

    /**
     * Get all entities
     * @return
     */
    List<T> getAllEntities();

    /**
     * Get entity by id
     * @param id
     * @return
     */
    T get(Long id);

    /**
     * Insert entity
     * @param entity
     */
    void create(T entity);

    /**
     * Insert entities
     * @param entities
     */
    void create(List<T> entities);

    /**
     * Update entity
     * @param entity
     */
    void update(T entity);
}
