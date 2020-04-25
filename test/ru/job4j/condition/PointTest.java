package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;
import ru.job4j.converter.Converter;

import static ru.job4j.condition.Point.distance;

public class PointTest {

    @Test
    public void when37to710ThenDistance5() {
        int in1 = 3;
        int in2 = 7;
        int in3 = 7;
        int in4 = 10;
        double expected = 5.0;
        double out = distance(in1, in2, in3, in4);
        Assert.assertEquals(expected, out, 0.01);
    }
}