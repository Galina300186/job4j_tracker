package ru.job4j.oop;

import junit.framework.TestCase;
import org.junit.Assert;

public class MaxTest extends TestCase {

    public void testMax2() {
        int first = 1;
        int second = 2;
        int result = Max.max(first, second);
        int expected = 2;
        Assert.assertEquals(result, expected);
    }

    public void testMax3() {
        int first = 1;
        int second = 2;
        int third = 5;
        int result = Max.max(first, second, third);
        int expected = 5;
        Assert.assertEquals(result, expected);
    }

    public void testMax4() {
        int first = 1;
        int second = 2;
        int third = 5;
        int fourth = 4;
        int result = Max.max(first, second, third, fourth);
        int expected = 5;
        Assert.assertEquals(result, expected);
    }
}