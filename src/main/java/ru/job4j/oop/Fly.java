package ru.job4j.oop;

public class Fly implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " flying through the air. ");
    }
}
