package com.trendyol;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import property.ConfigurationInstance;
import property.PropertyReader;
import property.dao.data.ConnectionSpec;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class TrendyolTaskApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrendyolTaskApplication.class, args);

		ConfigurationInstance configurationInstance = new ConfigurationInstance();
		String property = configurationInstance.loadConfigProperties("config.properties", "application.name");

		ConnectionSpec connectionSpec = new ConnectionSpec("localhost", 27017, "configuration");

		PropertyReader propertyReader = new PropertyReader(property, connectionSpec, 2);

		List<String> list = propertyReader.getValue("Value");
		for (String o : list)
			System.out.println(o.toString());
	}

}
