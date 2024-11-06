package gov.ny.organization.management.service.controller;


import gov.ny.organization.management.service.model.Response;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.UUID;

@RestController
@RequestMapping("/v1.0")
public class OrgManagementController {

    private static final Logger logger = LoggerFactory.getLogger(OrgManagementController.class);


    @GetMapping(path = "/getName", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Response> getCorrelationsV3(@RequestParam("x-api-token") String token,
                                                      @RequestHeader("x-api-key") String apiKey) {
        String uniqueIdentifier = "[" + UUID.randomUUID() + "]";
        logger.info("{} | ********************************* START -/getName *********************************", uniqueIdentifier);

        HttpHeaders headers = new HttpHeaders();
        headers.add(HttpHeaders.CACHE_CONTROL, "no-store");
        headers.add(HttpHeaders.PRAGMA,"no-cache");
        headers.add("Strict-Transport-Security","max-age=63072000");

        Response response = new Response();
        response.setStatus("Sample Test Successful Response");

        logger.info("{} | ********************************* END *********************************", uniqueIdentifier);

        return  ResponseEntity.ok()
                .headers(headers)
                .body(response);
    }
}
