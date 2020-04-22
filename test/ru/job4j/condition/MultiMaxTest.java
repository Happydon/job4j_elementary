package ru.job4j.condition;
import static org.hamcrest.Matchers.is;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultiMaxTest {
    @Test
    public void whenFirstMax() {
        MultiMax check = new MultiMax();
        int result = check.max(7, 3, 5);
        assertThat(result, is(7));
    }
    @Test
    public void whenSecondMax() {
        MultiMax check = new MultiMax();
        int result = check.max(1, 4, 2);
        assertThat(result, is(4));
    }
    @Test
    public void whenThirdMax() {
        MultiMax check = new MultiMax();
        int result = check.max(4, 9, 12);
        assertThat(result, is(12));
    }
    @Test
    public void whenEachOneMax() {
        MultiMax check = new MultiMax();
        int result = check.max(5, 5, 5);
        assertThat(result, is(5));
    }
}