package io.patriot_framework.generator.runner;

import io.patriot_framework.generator.controll.server.CoapControlServer;
import io.patriot_framework.generator.device.Device;
import io.patriot_framework.generator.device.active.ActiveDevice;
import io.patriot_framework.generator.runner.configuration.Constants;
import io.patriot_framework.generator.utils.JSONSerializer;

import java.io.File;

/**
 * @author <a href="mailto:jakub.smadis@gmail.com">Jakub Smadis</a>
 */
public class Runner {

    public static void main(String[] args) {
        if (System.getenv(Constants.DEVICE_CONFIG_FILE) != null) {
            String deviceFile = System.getenv(Constants.DEVICE_CONFIG_FILE);
            Device device = JSONSerializer.deserializeDevice(new File(deviceFile));
            device.registerToCoapServer();
            CoapControlServer.getInstance().start();
        }

        if (System.getenv(Constants.ACTIVE_CONFIG_FILE) != null) {
            String file = System.getenv(Constants.ACTIVE_CONFIG_FILE);
            ActiveDevice activeDevice = JSONSerializer.deserializeActiveDevice(new File(file));
            activeDevice.getDevice().registerToCoapServer();
            activeDevice.start();
        }
    }
}
