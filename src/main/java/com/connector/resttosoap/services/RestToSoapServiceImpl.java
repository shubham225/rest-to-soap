package com.connector.resttosoap.services;

import org.springframework.stereotype.Service;

@Service
public class RestToSoapServiceImpl implements RestToSoapService {
    @Override
    public String callSOAPService(String endpoint) {
        return "Test";
    }
}
