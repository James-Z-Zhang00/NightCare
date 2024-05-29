/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.demo.nightcare;

import java.util.Vector;

public class AgeGroup {

    public enum Grade {
        INFANT, TODDLER, PRE_K, KINDERGARTEN, FIRST, SECOND, THIRD, FOURTH, FIFTH
    }

    private final Grade grade;
    private final int maxNumberOfClassrooms;
    private Vector<ClassRoom> classRooms;

    public AgeGroup(Grade grade, int classRoomCapacity) {
        this.grade = grade;
        this.maxNumberOfClassrooms = classRoomCapacity;
        this.classRooms = new Vector<ClassRoom>();
    }

    public Grade getGrade() {
        return grade;
    }
    public int getMaxNumberOfClassrooms() {
        return maxNumberOfClassrooms;
    }

    public Vector<ClassRoom> getClassRooms() {
        return classRooms;
    }

    public Boolean addClassRoom(ClassRoom classRoom) {
        if (classRooms.size() < maxNumberOfClassrooms) {
            classRooms.add(classRoom);
            return true;
        }
        return false;
    }

    public Boolean hireTeacher(Teacher teacher) {
        for (ClassRoom classRoom : classRooms) {
            if (classRoom.addTeacher(teacher)) {
                return true;
            }
        }
        return false;
    }

    public Boolean enrollStudent(Student student) {
        for (ClassRoom classRoom : classRooms) {
            if (classRoom.addStudent(student)) {
                return true;
            }
        }
        return false;
    }

}