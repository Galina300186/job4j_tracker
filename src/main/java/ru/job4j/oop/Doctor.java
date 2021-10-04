package ru.job4j.oop;

public class Doctor extends Profession {

    private int category;
    private int stage;

    public Doctor(String name, String surname, String education, String birthday, int category, int stage) {
        super(name, surname, education, birthday);
        this.category = category;
        this.stage = stage;
    }
}