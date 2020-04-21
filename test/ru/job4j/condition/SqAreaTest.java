package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.Converter;

import static org.junit.Assert.*;
import static ru.job4j.condition.SqArea.square;

public class SqAreaTest {

    @Test
    public void whenP6K2ThenArea2() {
        int in1 = 6;
        int in2 = 2;
        int expected = 2;
        double out = square(in1, in2);
        Assert.assertEquals(expected, out, 0.01);
    }
}