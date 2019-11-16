package com.springboot.properties.controller;

import com.springboot.properties.common.bean.Book;
import com.springboot.properties.common.bean.Books;
import com.springboot.properties.common.bean.Person;
import com.springboot.properties.common.bean.Provider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    Person person;
    @Autowired
    Provider provider;
    @Autowired
    Books books;
    @GetMapping("/getPerson")
    public String getPerson(){
        return person.getName();
    }
    @GetMapping("/getProvider")
    public String getProvider(){
        return provider.getName();
    }
    @GetMapping("/getBooks")
    public List<Book> getBooks(){
        return books.getType();
    }
}
