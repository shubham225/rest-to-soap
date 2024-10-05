package com.connector.resttosoap.controllers;

import com.connector.resttosoap.schemas.AddResponse;
import com.connector.resttosoap.services.AdditionService;
import com.connector.resttosoap.services.RestToSoapService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/V1/SOAP/")
public class RestToSoapController {
    private final RestToSoapService restToSoapService;
    private final AdditionService additionService;

    public RestToSoapController(RestToSoapService restToSoapService, AdditionService additionService) {
        this.restToSoapService = restToSoapService;
        this.additionService = additionService;
    }

    @RequestMapping(
            method = RequestMethod.POST,
            path = "/{endpoint}"
    )
    public String processSOAPRequest(@PathVariable String endpoint,
                                     String request) {
        return restToSoapService.callSOAPService(endpoint);
    }

    @RequestMapping(
            method = RequestMethod.POST,
            path = "/add"
    )
    public AddResponse testSOAPService() {
        return additionService.Add();
    }
}
