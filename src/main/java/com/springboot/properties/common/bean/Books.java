package com.springboot.properties.common.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@ConfigurationProperties(prefix = "books")
public class Books {
    private List<Book> type;

    public List<Book> getType() {
        return type;
    }

    public void setType(List<Book> type) {
        this.type = type;
    }
}
