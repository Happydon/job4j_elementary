package ru.job4j.oop.condition;
public class Max {
    public double max(double first, double second) {
        return first > second ? first : second;
    }
    public double max(double first, double second, double third) {
        return third > max(first, second) ? third : max(first, second);
    }
    public double max(double first, double second, double third, double fourth) {
        return max(third, fourth) > max(first, second) ? max(third, fourth) : max(first, second);
    }
}
