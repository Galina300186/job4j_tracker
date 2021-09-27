package ru.job4j.oop;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;


public class PointTest {
    @Test
    public void whenZeroAndTenThenTen() {
        Point first = new Point(0, 0);
        Point second = new Point(0, 10);
        double result = first.distance(second);
        System.out.println(String.format("Result is %s", result));
        assertThat(result, is(10D));
    }

    @Test
    public void whenZeroAndTenAndFourThenTen() {
        Point first = new Point(0, 0, 4);
        Point second = new Point(0, 10, 4);
        double result = first.distance(second);
        System.out.println(String.format("Result is %s", result));
        assertThat(result, is(10D));
    }
}