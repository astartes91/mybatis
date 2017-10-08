package org.bibliarij.assignment2gis.services;

import org.bibliarij.assignment2gis.mappers.OrganizationMapper;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.time.LocalDateTime;

/**
 * Tests for class {@link OrganizationServiceImpl}
 */
@RunWith(PowerMockRunner.class)
@PrepareForTest({OrganizationServiceImpl.class, LocalDateTime.class})
public class OrganizationServiceImplTest {

    @InjectMocks
    private OrganizationServiceImpl organizationService;

    @Mock
    private OrganizationMapper mapper;

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void create() throws Exception {
    }
}