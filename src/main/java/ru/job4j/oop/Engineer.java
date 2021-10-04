package ru.job4j.oop;

public class Engineer extends Profession {
    private int technical;
    private int stage;

    public Engineer(String name, String surname, String education, String birthday, int technical, int stage) {
        super(name, surname, education, birthday);
        this.technical = technical;
        this.stage = stage;
    }
}

