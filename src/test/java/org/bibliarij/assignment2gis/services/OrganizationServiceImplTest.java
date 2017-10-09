package org.bibliarij.assignment2gis.services;

import org.assertj.core.api.Assertions;
import org.bibliarij.assignment2gis.entities.Organization;
import org.bibliarij.assignment2gis.mappers.OrganizationMapper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

/**
 * Tests for class {@link OrganizationServiceImpl}
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest({OrganizationServiceImpl.class, LocalDateTime.class})
public class OrganizationServiceImplTest {

    private OrganizationServiceImpl organizationService;
    private LocalDateTime now;
    private Organization entity;

    public OrganizationServiceImplTest() {
        now = LocalDateTime.parse("2010-10-10T10:10:10");
        PowerMockito.mockStatic(LocalDateTime.class);
    }

    @Mock
    private OrganizationMapper mapper;

    @Before
    public void setUp() throws Exception {
        entity = new Organization();
        entity.setId(1L);
        organizationService = new OrganizationServiceImpl(mapper);

        PowerMockito.when(LocalDateTime.now()).thenReturn(now);
    }

    /**
     * @verifies correctly create organization
     * @see OrganizationServiceImpl#create(Organization)
     * @throws Exception
     */
    @Test
    public void create_shouldCorrectlyCreateOrganization() throws Exception {

        Set<String> phoneNumbers = new HashSet<>();
        phoneNumbers.add("1");
        entity.setPhoneNumbers(phoneNumbers);
        organizationService.create(entity);

        Mockito.verify(mapper).insert(entity);
        Assertions.assertThat(entity.getCreationUpdateDateTime()).isEqualTo(now);
        Mockito.verify(mapper).insertPhone("1", 1L);
    }

    /**
     * @verifies correctly update organization
     * @see OrganizationServiceImpl#update(Organization)
     * @throws Exception
     */
    @Test
    public void update_shouldCorrectlyUpdateOrganization() throws Exception {

        Organization oldOrganization = new Organization();
        Set<String> oldPhoneNumbers = new HashSet<>();
        oldPhoneNumbers.add("1");
        oldPhoneNumbers.add("2");
        oldOrganization.setPhoneNumbers(oldPhoneNumbers);
        Mockito.when(mapper.get(1L)).thenReturn(oldOrganization);

        Set<String> phoneNumbers = new HashSet<>();
        phoneNumbers.add("2");
        phoneNumbers.add("3");
        entity.setPhoneNumbers(phoneNumbers);

        organizationService.update(entity);

        Mockito.verify(mapper).update(entity);
        Assertions.assertThat(entity.getCreationUpdateDateTime()).isEqualTo(now);
        Mockito.verify(mapper).insertPhone("3", 1L);
        Mockito.verify(mapper).deletePhone("1", 1L);
    }
}