package org.bibliarij.mybatis.mappers;

import org.bibliarij.mybatis.entities.Entity;

import java.util.List;

/**
 * MyBatis mapper for generic entity
 * @param <T>
 */
public interface EntityMapper<T extends Entity> {

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
     * @return
     */
    void insert(T entity);

    /**
     * Update entity
     * @param entity
     */
    void update(T entity);
}
