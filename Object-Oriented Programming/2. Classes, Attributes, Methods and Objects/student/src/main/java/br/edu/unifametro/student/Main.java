package br.edu.unifametro.student;

import java.time.LocalDate;

/*
 * Create a class representing a college student with the following attributes: name, admission year, academic major,
 * number of subjects approved. This class must have a method for calculating the student's credits (each subject taken
 * equals 4 credits) and another for calculating how many years this student has spent in college.
 * */

public class Main {
    public static void main(String[] args) {

        Student student = new Student("George Pine", LocalDate.of(2020, 2, 7), "Computer Science", 15);

        System.out.println("Credits: " + student.calculateCreditAmount());
        System.out.println("Years in College: " + student.calculateYearsSpentInCollege());
    }
}