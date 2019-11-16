package com.springboot.properties.common.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component

/*@PropertySource("classpath:application.properties")*/
/*@ConfigurationProperties(prefix = "person")*/
public class Person {

    @Value("${person.name}")
    private String name;
    @Value("${person.age}")
    private Integer age;
    @Value("${person.sex}")
    private String sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }


}
