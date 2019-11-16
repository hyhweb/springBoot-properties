package com.springboot.properties.common.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource(value = "classpath:provider.properties",ignoreResourceNotFound = true,encoding = "UTF-8")
public class Provider {
    @Value("${provider.name}")
    private String name;
    @Value("${provider.city}")
    private String city;
    @Value("${provider.restrict}")
    private String restrict;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRestrict() {
        return restrict;
    }

    public void setRestrict(String restrict) {
        this.restrict = restrict;
    }
}
