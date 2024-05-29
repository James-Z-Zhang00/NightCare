/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.demo.nightcare;

/**
 *
 * @author aksha
 */
public class Student extends Person{

    private double gpa;
    private ImmunizationRecord immunizationRecord;
    private AgeInMonths ageInMonths;

    public static enum AgeInMonths {
        SIXTOTWELVE, THIRTEENTOTWENTYFOUR, TWENTYFIVETOTHIRTYFIVE, THIRTYSIXTOFORTYSEVEN, FORTYEIGHTTOFIFTYNINE, SIXTYANDABOVE
    }

    public Student(String csvString) {
        super(csvString);
        String[] values = csvString.split(",");
        this.gpa = Double.parseDouble(values[3]);
        //this.immunizationRecord = new ImmunizationRecord(values[4]);
        
        if (this.getAge() >= 6 && this.getAge() <= 12) {
            this.ageInMonths = AgeInMonths.SIXTOTWELVE;
        } else if (this.getAge() >= 13 && this.getAge() <= 24) {
            this.ageInMonths = AgeInMonths.THIRTEENTOTWENTYFOUR;
        } else if (this.getAge() >= 25 && this.getAge() <= 35) {
            this.ageInMonths = AgeInMonths.TWENTYFIVETOTHIRTYFIVE;
        } else if (this.getAge() >= 36 && this.getAge() <= 47) {
            this.ageInMonths = AgeInMonths.THIRTYSIXTOFORTYSEVEN;
        } else if (this.getAge() >= 48 && this.getAge() <= 59) {
            this.ageInMonths = AgeInMonths.FORTYEIGHTTOFIFTYNINE;
        } else {
            this.ageInMonths = AgeInMonths.SIXTYANDABOVE;
        }
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public ImmunizationRecord getImmunizationRecord() {
        return immunizationRecord;
    }

    public void setImmunizationRecord(ImmunizationRecord immunizationRecord) {
        this.immunizationRecord = immunizationRecord;
    }

//    public void updateImmunizationDate(ImmunizationRecord.Immunization immunization, java.sql.Date date) {
//        immunizationRecord.setImmunizationDate(immunization, date);
//    }

    public void check() {}
    
}
