package ru.job4j.condition;

public class MultiMax {
    public int max(int first, int second, int third) {
        int start = first > second ? first : second;
        int result = third > start ? third : start;
        return result;
    }
}
