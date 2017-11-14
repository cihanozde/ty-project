package com.trendyol.service;

import org.springframework.stereotype.Service;
import property.ConfigurationInstance;
import property.PropertyReader;
import property.dao.data.ConnectionSpec;

import java.util.List;

/**
 * Created by cihanozdemir on 14.11.2017.
 */
@Service
public class ExternalReaderService
{
    public List<String> configurationReadByKey(String key)
    {

        ConfigurationInstance configurationInstance = new ConfigurationInstance();
        String property = configurationInstance.loadConfigProperties("config.properties", "application.name");

        ConnectionSpec connectionSpec = new ConnectionSpec("localhost", 27017, "configuration");

        PropertyReader propertyReader = new PropertyReader(property, connectionSpec, 2);

        return propertyReader.getValue(key);
    }
}
