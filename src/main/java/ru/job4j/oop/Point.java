package ru.job4j.oop;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Point {

    private int x;

    private int y;

    private int z;

    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double distance(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    public double distance3d(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2) + pow(this.z - that.z, 2));
    }

    public static void main(String[] args) {
        Point a = new Point(0, 0, 9);
        Point b = new Point(0, 2, 7);
        Point z = new Point(0, 2, 7);
        double dist = a.distance(b);
        double dist1 = b.distance3d(z);
        double dist2 = a.distance3d(b);
        System.out.println(dist);
        System.out.println(dist1);
        System.out.println(dist2);
    }
}