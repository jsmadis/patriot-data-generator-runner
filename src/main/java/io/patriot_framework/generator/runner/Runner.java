package io.patriot_framework.generator.runner;

import io.patriot_framework.generator.controll.client.CoapControlClient;
import io.patriot_framework.generator.controll.server.CoapControlServer;
import io.patriot_framework.generator.device.Device;
import io.patriot_framework.generator.runner.configuration.Constants;
import io.patriot_framework.generator.utils.JSONSerializer;

import java.io.File;

/**
 * @author <a href="mailto:jakub.smadis@gmail.com">Jakub Smadiš</a>
 */
public class Runner {

    public static void main(String[] args) {
        String deviceFile = System.getenv(Constants.DEVICE_CONFIG_FILE);
        Device device = JSONSerializer.deserializeDevice(new File(deviceFile));
        device.registerToCoapServer();
        CoapControlClient client = new CoapControlClient("coap://127.0.0.1:5683");







    }
}
