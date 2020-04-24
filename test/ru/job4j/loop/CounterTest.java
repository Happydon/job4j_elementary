package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class CounterTest {

    @Test
    public void whenSumFrom1To10Then55() {
        int rsl = Counter.sum(1, 10);
        int expected = 55;
        assertThat(rsl, is(expected));
    }
    @Test
    public void whenSumFrom3To8Then55() {
        int rsl = Counter.sum(3, 8);
        int expected = 33;
        assertThat(rsl, is(expected));
    }
    @Test
    public void whenSumEvenFrom1To10Then30() {
        int rsl = Counter.sumByEven(1, 10);
        int expected = 30;
        assertThat(rsl, is(expected));
    }
    @Test
    public void whenSumEvenFrom3To8Then18() {
        int rsl = Counter.sumByEven(3, 8);
        int expected = 18;
        assertThat(rsl, is(expected));
    }
}