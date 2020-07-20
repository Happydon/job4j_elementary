package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;
import ru.job4j.converter.Converter;


public class PointTest {

    @Test
    public void when37to710ThenDistance5() {
        Point a = new Point(3, 7);
        Point b = new Point(7, 10);
        double expected = 5.0;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}