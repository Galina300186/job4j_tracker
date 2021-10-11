package ru.job4j.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFio("Ponomareva Galina");
        student.setGroup("it");
        student.setReceipt(new Date());

        System.out.println(student.getFio() + " group - " + student.getGroup() + " : " + student.getReceipt());
    }
}
