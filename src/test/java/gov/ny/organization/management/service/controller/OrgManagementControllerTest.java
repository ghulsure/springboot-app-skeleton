package gov.ny.organization.management.service.controller;

import gov.ny.organization.management.service.model.TestResponse;
import gov.ny.organization.management.service.service.OrgManagementService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

class OrgManagementControllerTest {


    @InjectMocks
    private OrgManagementController orgManagementController;

    @Mock
    private OrgManagementService orgManagementService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);

    }

    @Test
    void testGetName(){

        //TODO: complete test case
    }
}