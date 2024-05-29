/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.demo.nightcare;

import java.util.Vector;

public class ClassRoom {

    private final int capacity;
    private Vector<Teacher> teachers;
    private Vector<Student> students;

    public ClassRoom() {
        this.capacity = 30;
        this.teachers = new Vector<Teacher>();
        this.students = new Vector<Student>();
    }

    public int getCapacity() {
        return capacity;
    }

    public Vector<Teacher> getTeachers() {
        return teachers;
    }

    public void setCredits(int credits) {
        for (Teacher teacher : teachers) {
            teacher.setCredits(credits);
        }
    }

    public Boolean addTeacher(Teacher teacher) {
        if (teachers.size() < 4) {
            teachers.add(teacher);
            return true;
        }
        return false;
    }

    public void removeTeacher(Teacher teacher) {

        if (teachers.size() > 0) {
            teachers.remove(teacher);
        }
    }

    public Boolean addStudent(Student student) {
        if (students.size() < capacity) {
            students.add(student);
            return true;
        }
        return false;
    }
    

}