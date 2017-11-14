package com.trendyol.service;

import com.trendyol.entity.Property;
import com.trendyol.model.PropertyModel;
import com.trendyol.repository.PropertyRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by cihanozdemir on 13.11.2017.
 */
@Service
public class PropertyReaderService
{
    private final PropertyRepository propertyRepository;

    @Autowired
    public PropertyReaderService(PropertyRepository propertyRepository)
    {
        this.propertyRepository = propertyRepository;
    }

    public List<Property> getAllProperties()
    {
        return propertyRepository.findAll();
    }

    public Property getProperty(ObjectId objectId)
    {
        return propertyRepository.findOne(objectId);
    }

    public void insertProperty(PropertyModel propertyModel)
    {
        Property property = new Property();
        property.setName(propertyModel.getName());
        property.setValue(propertyModel.getValue());
        property.setApplicationName(propertyModel.getApplicationName());
        property.setIsActive(propertyModel.getIsActive());
        property.setType(propertyModel.getType());
        propertyRepository.insert(property);
    }

    public void updateProperty(ObjectId objectId, PropertyModel propertyModel)
    {
        Property property = getProperty(objectId);
        property.setName(propertyModel.getName());
        property.setValue(propertyModel.getValue());
        property.setApplicationName(propertyModel.getApplicationName());
        property.setIsActive(propertyModel.getIsActive());
        property.setType(propertyModel.getType());
        propertyRepository.save(property);
    }

    public void deleteProperty(ObjectId objectId)
    {
        Property property = getProperty(objectId);
        if (property != null) {
            propertyRepository.delete(property);
        }
    }

}
