package com.northcoders.databindingdemo.model;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import com.northcoders.databindingdemo.BR;

public class Person extends BaseObservable {
    private String name;
    private String age;
    private String email;

    public Person(String age, String email, String name) {
        this.age = age;
        this.email = email;
        this.name = name;
    }


    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }

    @Bindable
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        notifyPropertyChanged(BR.email);
    }

    @Bindable
    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
        notifyPropertyChanged(BR.age);
    }
}
