package io.patriot_framework.generator.runner;

import io.patriot_framework.generator.controll.client.CoapControlClient;
import org.eclipse.californium.elements.exception.ConnectorException;

import java.io.IOException;

/**
 * @author <a href="mailto:jakub.smadis@gmail.com">Jakub Smadiš</a>
 */
public class Main {
    public static void main(String[] args) throws ConnectorException, IOException {
        CoapControlClient client = new CoapControlClient("coap://localhost:5683");

        client.get("/sensor/simpleThermometer");
    }
}
