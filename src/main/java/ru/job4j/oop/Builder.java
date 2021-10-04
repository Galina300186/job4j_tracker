package ru.job4j.oop;

public class Builder extends Engineer {
    private String type;

    public Builder(String name, String surname, String education, String birthday, int technical, int stage, String type) {
        super(name, surname, education, birthday, technical, stage);
        this.type = type;
    }
}
