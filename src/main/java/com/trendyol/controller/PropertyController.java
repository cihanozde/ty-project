package com.trendyol.controller;

import com.trendyol.entity.Property;
import com.trendyol.model.PropertyModel;
import com.trendyol.service.ExternalReaderService;
import com.trendyol.service.PropertyReaderService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by cihanozdemir on 13.11.2017.
 */
@RestController
@RequestMapping("/property")
public class PropertyController
{
    @Autowired
    private  PropertyReaderService propertyReaderService;
    @Autowired
    private  ExternalReaderService externalReaderService;

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Property> getAllProperties()
    {
        return propertyReaderService.getAllProperties();
    }

    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    public Property getProperty(@PathVariable("id") ObjectId objectId)
    {
        return propertyReaderService.getProperty(objectId);
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public void addProperty(@RequestBody PropertyModel propertyModel)
    {
        propertyReaderService.insertProperty(propertyModel);
    }

    @RequestMapping(value = "/update/{id}", method = RequestMethod.PUT)
    public void updateProperty(@PathVariable("id") ObjectId objectId, @RequestBody PropertyModel propertyModel)
    {
        propertyReaderService.updateProperty(objectId, propertyModel);
    }

    @RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
    public void deleteProperty(@PathVariable("id") ObjectId objectId)
    {
        propertyReaderService.deleteProperty(objectId);
    }

    @RequestMapping(value = "/get/value/{key}", method = RequestMethod.GET)
    public List<String> getPropertyByKey(@PathVariable("key") String key)
    {
        return externalReaderService.configurationReadByKey(key);
    }
}
