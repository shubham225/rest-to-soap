package com.connector.resttosoap.controllers;

import com.connector.resttosoap.services.RestToSoapService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/V1/SOAP/")
public class RestToSoapController {
    private final RestToSoapService restToSoapService;

    public RestToSoapController(RestToSoapService restToSoapService) {
        this.restToSoapService = restToSoapService;
    }

    @RequestMapping(
            method = RequestMethod.POST,
            path = "/{endpoint}"
    )
    public String processSOAPRequest(@PathVariable String endpoint,
                                     String request) {
        return restToSoapService.callSOAPService(endpoint);
    }
}
