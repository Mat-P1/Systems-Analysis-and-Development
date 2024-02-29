package br.edu.unifametro.student;

import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class Student {

    public String name;
    public LocalDate admissionDate;
    public String academicMajor;
    public int approvedSubjects;

    public Student(String name, LocalDate admissionDate, String academicMajor, int approvedSubjects) {
        this.name = name;
        this.admissionDate = admissionDate;
        this.academicMajor = academicMajor;
        this.approvedSubjects = approvedSubjects;
    }

    public int calculateCreditAmount() {
        return this.approvedSubjects * 4;
    }

    public Long calculateYearsSpentInCollege() {
        return ChronoUnit.YEARS.between(admissionDate, LocalDate.now(ZoneId.of("America/Sao_Paulo")));
    }
}
