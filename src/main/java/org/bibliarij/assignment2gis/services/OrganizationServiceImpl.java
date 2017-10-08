package org.bibliarij.assignment2gis.services;

import org.bibliarij.assignment2gis.entities.Organization;
import org.bibliarij.assignment2gis.mappers.EntityMapper;
import org.bibliarij.assignment2gis.mappers.OrganizationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Service for {@link Organization} entity
 */
@Service
public class OrganizationServiceImpl extends EntityServiceImpl<Organization> implements OrganizationService {

    @Autowired
    private OrganizationMapper mapper;

    /**
     * Insert entity
     *
     * @param entity
     */
    @Override
    public void create(Organization entity) {

        entity.setCreationUpdateDateTime(LocalDateTime.now());
        super.create(entity);

        entity.getPhoneNumbers().forEach(phone -> mapper.insertPhone(phone, entity.getId()));
    }

    /**
     * Update entity
     *
     * @param entity
     */
    @Override
    public void update(Organization entity) {

        entity.setCreationUpdateDateTime(LocalDateTime.now());
        super.update(entity);

        Organization oldOrganization = get(entity.getId());
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
     * Get organizations by name
     *
     * @param name
     * @return
     */
    @Override
    public List<Organization> get(String name) {
        return mapper.getByName(name);
    }

    /**
     * Get organizations by creation/update date-time
     *
     * @param creationUpdateDateTime
     * @return
     */
    @Override
    public List<Organization> get(LocalDateTime creationUpdateDateTime) {
        return mapper.getByCreationUpdateDateTime(creationUpdateDateTime);
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
