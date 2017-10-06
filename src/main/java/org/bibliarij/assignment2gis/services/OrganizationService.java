package org.bibliarij.assignment2gis.services;

import org.bibliarij.assignment2gis.entities.Organization;

import java.util.List;

/**
 * Service for {@link Organization} entity
 *
 * @author Vladimir Nizamutdinov (astartes91@gmail.com)
 */
public interface OrganizationService extends EntityService<Organization> {

    /**
     * Get organizations by name
     * @param name
     * @return
     */
    List<Organization> get(String name);
}
