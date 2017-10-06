package org.bibliarij.assignment2gis.services;

import org.bibliarij.assignment2gis.entities.Organization;
import org.bibliarij.assignment2gis.mappers.EntityMapper;
import org.bibliarij.assignment2gis.mappers.OrganizationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * Service for {@link Organization} entity
 */
@Service
public class OrganizationServiceImpl extends EntityServiceImpl<Organization> {

    @Autowired
    private OrganizationMapper mapper;

    /**
     * Insert entity
     *
     * @param entity
     */
    @Override
    public void insertEntity(Organization entity) {
        super.insertEntity(entity);

        entity.getPhoneNumbers().forEach(phone -> mapper.insertPhone(phone, entity.getId()));
    }

    /**
     * Update entity
     *
     * @param entity
     */
    @Override
    public void updateEntity(Organization entity) {

        super.updateEntity(entity);

        Organization oldOrganization = getEntity(entity.getId());
        Set<String> oldPhoneNumbers = oldOrganization.getPhoneNumbers();

        Set<String> newPhones = entity.getPhoneNumbers();
        Set<String> addedPhones = new HashSet<>(newPhones);
        addedPhones.removeAll(oldPhoneNumbers);
        addedPhones.forEach(phone -> mapper.insertPhone(phone, entity.getId()));

        Set<String> deletedPhones = new HashSet<>(oldPhoneNumbers);
        deletedPhones.removeAll(newPhones);
        deletedPhones.forEach(phone -> mapper.deletePhone(phone, entity.getId()));
    }

    /**
     * Get instance of mapper
     *
     * @return
     */
    @Override
    protected EntityMapper<Organization> getMapper() {
        return mapper;
    }
}
