package com.connector.resttosoap.services;

import com.connector.resttosoap.schemas.Add;
import com.connector.resttosoap.schemas.AddResponse;
import org.springframework.stereotype.Service;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

public class AdditionService extends WebServiceGatewaySupport {
    public AddResponse Add() {
        Add add = new Add();
        add.setIntA(2);
        add.setIntB(3);

        return (AddResponse) getWebServiceTemplate().marshalSendAndReceive("http://www.dneonline.com/calculator.asmx", add);
    }
}
