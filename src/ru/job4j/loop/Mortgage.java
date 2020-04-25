package ru.job4j.loop;

public class Mortgage {
    public int year(int amount, int salary, int percent) {
        int year = 0;
        while (amount > 0) {
            amount = amount * (100 + percent) / 100 - salary;
            year++;
        }
        return year;
    }
}
