package com.trendyol.model;

import java.io.Serializable;

/**
 * Created by cihanozdemir on 14.11.2017.
 */
public class PropertyModel implements Serializable
{
    private String name;
    private String type;
    private String value;
    private String isActive;
    private String applicationName;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public String getValue()
    {
        return value;
    }

    public void setValue(String value)
    {
        this.value = value;
    }

    public String getIsActive()
    {
        return isActive;
    }

    public void setIsActive(String isActive)
    {
        this.isActive = isActive;
    }

    public String getApplicationName()
    {
        return applicationName;
    }

    public void setApplicationName(String applicationName)
    {
        this.applicationName = applicationName;
    }

    @Override
    public String toString()
    {
        return "PropertyModel{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", value='" + value + '\'' +
                ", isActive='" + isActive + '\'' +
                ", applicationName='" + applicationName + '\'' +
                '}';
    }
}
