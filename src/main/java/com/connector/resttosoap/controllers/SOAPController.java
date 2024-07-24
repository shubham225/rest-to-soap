package com.connector.resttosoap.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/V1/SOAP/")
public class SOAPController {
    @RequestMapping(
            method = RequestMethod.POST,
            path = "/{endpoint}"
    )
    public String processSOAPRequest(@PathVariable String endpoint) {
        return "Test";
    }
}
