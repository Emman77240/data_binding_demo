package com.northcoders.databindingdemo.model;

public class Person {
    private String name;
    private String age;
    private String email;

    public Person(String age, String email, String name) {
        this.age = age;
        this.email = email;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
