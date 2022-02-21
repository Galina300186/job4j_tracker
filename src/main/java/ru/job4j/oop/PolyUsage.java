package ru.job4j.oop;

public class PolyUsage {
    public static void main(String[] args) {
        Vehicle fly = new Fly();
        Vehicle train = new Train();
        Vehicle bus = new Bus();

        Vehicle[] vehicles = new Vehicle[]{fly, train, bus};
        for (Vehicle a : vehicles) {
            a.move();
        }
    }
}

