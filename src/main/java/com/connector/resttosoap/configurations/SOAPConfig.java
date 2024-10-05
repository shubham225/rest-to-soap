package com.connector.resttosoap.configurations;

import com.connector.resttosoap.services.AdditionService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class SOAPConfig {

    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();

        marshaller.setContextPath("com.connector.resttosoap.schemas");

        return marshaller;
    }

    @Bean
    public AdditionService countryClient(Jaxb2Marshaller marshaller) {
        AdditionService client = new AdditionService();
        client.setDefaultUri("http://www.dneonline.com/");
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        return client;
    }
}
