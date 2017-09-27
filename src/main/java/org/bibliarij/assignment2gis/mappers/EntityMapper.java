package org.bibliarij.assignment2gis.mappers;

import org.apache.ibatis.annotations.Param;
import org.bibliarij.assignment2gis.entities.Entity;

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
    T getEntity(@Param("id") Long id);

    /**
     * Insert entity
     * @param city
     * @return
     */
    void insertEntity(T city);

    /**
     * Update entity
     * @param entity
     */
    void updateEntity(T entity);
}
