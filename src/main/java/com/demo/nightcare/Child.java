/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.demo.nightcare;

/**
 *
 * @author virginia
 */
public class Child {
    
    private String name;
    private String id;
    private int age;
    
    public Child(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    
    public void setChild(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    
    public String[] getInfo() {
        String[] infoAsString = {id, name, String.valueOf(age)};
        return infoAsString;
    }
    
}
