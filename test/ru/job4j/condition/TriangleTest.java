package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import static ru.job4j.condition.Triangle.exist;

public class TriangleTest {

    @Test
    public void when222ThenTrue() {
        boolean result = exist(2, 2, 2);
        assertThat(result, is(true));
    }

    @Test
    public void when337ThenFalse() {
        boolean result = exist(3, 3, 7);
        assertThat(result, is(false));
    }
}