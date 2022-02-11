package com.example.objectmapper;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User {

    private String name;
    private int age;

    @JsonProperty("phone_number")
    private String phoneNumber;

    public User(){
        this.name = null;
        this.age = 0;
        this.phoneNumber = null;
    }

    public User(String name, int agem, String phoneNumber){
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    // objectMapper를 사용하는 class에서는 get이름인 method를 사용하면 안된다. (get,set 메소드 제외)
    public User DefaultUser(){
        return new User("default",0,"1232465");
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
