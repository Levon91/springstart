package com.example.example3;

import org.springframework.beans.factory.annotation.Required;

/**
 * Created by levont on 21/03/2017.
 */
public class User {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    @Required
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    @Required
    public void setAge(int age) {
        this.age = age;
    }
}
