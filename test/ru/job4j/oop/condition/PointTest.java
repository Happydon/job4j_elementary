package ru.job4j.oop.condition;

import org.junit.Test;
import org.junit.Assert;
import ru.job4j.oop.condition.Point;


public class PointTest {

    @Test
    public void when37to710ThenDistance5() {
        Point a = new Point(3, 7);
        Point b = new Point(7, 10);
        double expected = 5.0;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }
    @Test
    public void when370to7105ThenDistance5() {
        Point a = new Point(3, 7, 3);
        Point b = new Point(5, 10, 9);
        double expected = 7.0;
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}