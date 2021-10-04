package ru.job4j.oop;

public class Engineer extends Profession {
    private int technical;
    private int stage;

    public Engineer() {
    }

    public Engineer(int technical, int stage) {
        this.technical = technical;
        this.stage = stage;
    }
}

