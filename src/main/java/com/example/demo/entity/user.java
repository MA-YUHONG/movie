package com.example.demo.entity;

public class user {
    private String name;

    private int age;

    private String sex;

    public String toString() {
        return "user{name='" + this.name + '\'' + ", age=" + this.age + ", sex='" + this.sex + '\'' + '}';
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return this.sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
