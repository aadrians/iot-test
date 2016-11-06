package iot.test;

import org.eclipse.paho.client.mqttv3.MqttClient;
import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		MqttClient client;

		try {
			client = new MqttClient("tcp://localhost:1883", "pahoMqttPublish1");
			client.connect();
			
			MqttMessage message = new MqttMessage();
			message.setPayload("Hello from Paho!".getBytes());
			client.publish("pahodemo/test", message);
			client.disconnect();
		} catch (MqttException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
