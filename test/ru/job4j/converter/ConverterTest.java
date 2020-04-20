package ru.job4j.converter;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.Converter;

public class ConverterTest {

    @Test
    public void whenConvert140RblThen2Euro() {
        int in = 160;
        int expected = 2;
        int out = Converter.rubleToEuro(in);
        Assert.assertEquals(expected, out);
    }


    @Test
    public void whenConvert280RblThen4Dlr() {
        int in = 280;
        int expected = 4;
        int out = Converter.rubleToDollar(in);
        Assert.assertEquals(expected, out);
    }
    @Test
    public void whenConvert0RblThen0Funt() {
        int in = 0;
        int expected = 0;
        int out = Converter.rubleToFunt(in);
        Assert.assertEquals(expected, out);
    }
}
