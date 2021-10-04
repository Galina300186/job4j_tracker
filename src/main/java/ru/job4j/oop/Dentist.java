package ru.job4j.oop;

public class Dentist extends Doctor {
    private String specialization;

    public Dentist(String name, String surname, String education, String birthday, int category, int stage, String specialization) {
        super(name, surname, education, birthday, category, stage);
        this.specialization = specialization;
    }
}

