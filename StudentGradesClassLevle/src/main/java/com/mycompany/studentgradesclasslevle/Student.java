/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.studentgradesclasslevle;

import java.util.Date;

/**
 *
 * @author alialghanay
 */
public class Student{
    public int id, bornYear, grade;
    public String name = new String();
    public Student(int id) {
        this.id = id;
    }
    private static Date thisYear = new Date();
    public int age() {
        int y = thisYear.getYear() + 1900;
        return (y - bornYear);
    }
}
