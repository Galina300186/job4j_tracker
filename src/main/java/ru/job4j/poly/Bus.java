package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void travel() {
        System.out.println("Bus go!");
    }

    @Override
    public void passengers(int count) {
        System.out.println("there are " + count + " passengers on the bus");
    }

    @Override
    public double fill(double liters) {
        double fuelCost = 10.25;
        return liters * fuelCost;
    }
}
