package com.example.restservice;


import io.patriot_framework.generator.controll.client.CoapControlClient;
import org.eclipse.californium.elements.exception.ConnectorException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class HttpToCoapController {

    @PostMapping("/get")
    public String get(@RequestBody() CoapConfiguration coapConfiguration) throws ConnectorException, IOException {
        CoapControlClient client = new CoapControlClient(coapConfiguration.getHostname());
        return new String(client.get(coapConfiguration.getPath()).getPayload());
    }

}
