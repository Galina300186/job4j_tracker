package ru.job4j.oop;

public class Programmer extends Engineer {
    private String language;

    public Programmer(String name, String surname, String education, String birthday, String language, int technical, int stage) {
        super(name, surname, education, birthday, technical, stage);
        this.language = language;
    }
}
