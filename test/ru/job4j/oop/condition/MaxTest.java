package ru.job4j.oop.condition;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.calculator.Calculator;
import ru.job4j.oop.condition.Max;

import static org.hamcrest.Matchers.closeTo;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        Max max = new Max();
        double rsl = max.max(1, 2);
        assertThat(rsl, closeTo(2, 0.001));
    }
    @Test
    public void whenMax1To3To5Then5() {
        Max max = new Max();
        double rsl = max.max(1, 3, 5);
        assertThat(rsl, closeTo(5, 0.001));
    }
    @Test
    public void whenMax2To4To6To8Then8() {
        Max max = new Max();
        double rsl = max.max(2, 4, 6, 8);
        assertThat(rsl, closeTo(8, 0.001));
    }
}