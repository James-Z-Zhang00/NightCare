/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.demo.nightcare;

/**
 *
 * @author aksha
 */
public class Teacher extends Person{

    private int credits;

    public Teacher(int credits, int age, String name) {
        super(age, name);
        this.credits = credits;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    @Override
    public String toString() {
        return "Credits: " + credits;
    }
    
    
}
