package org.bibliarij.mybatis.services;

import org.bibliarij.mybatis.entities.Street;
import org.bibliarij.mybatis.mappers.EntityMapper;
import org.bibliarij.mybatis.mappers.StreetMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Service for {@link Street} entity
 */
@Service
public class StreetServiceImpl extends EntityServiceImpl<Street> {

    @Autowired
    private StreetMapper mapper;

    /**
     * Get instance of mapper
     *
     * @return
     */
    @Override
    protected EntityMapper<Street> getMapper() {
        return mapper;
    }
}
