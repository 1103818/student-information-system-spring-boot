package com.example.studentinfosys.model;

public class Student {
    private int id;
    private String name;
    private int age;

    public int getId() {
        return this.id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return this.age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public String getname(){
        return this.name;
    }
    public void setname(String name){
        this.name=name;
    }
}