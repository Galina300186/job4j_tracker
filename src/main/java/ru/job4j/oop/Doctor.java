package ru.job4j.oop;

public class Doctor extends Profession {
    private int category;
    private int stage;

    public Doctor() {
    }

    public Doctor(int category, int stage) {
        this.category = category;
        this.stage = stage;
    }
}