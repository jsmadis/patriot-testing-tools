package com.example.restservice;


import io.patriot_framework.generator.controll.client.CoapControlClient;
import org.eclipse.californium.core.CoapResponse;
import org.eclipse.californium.elements.exception.ConnectorException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class HttpToCoapController {

    @PostMapping("/get")
    public String get(@RequestBody() CoapConfiguration coapConfiguration) {
        CoapControlClient client = new CoapControlClient(coapConfiguration.getHostname());
        try {
            CoapResponse coapResponse = client.get(coapConfiguration.getPath());
            if (coapResponse == null) {
                throw new DeviceNotFoundException();
            }
            return new String(coapResponse.getPayload());
        } catch (ConnectorException | IOException e) {
            throw new CoapConnectionException();
        }
    }

}
