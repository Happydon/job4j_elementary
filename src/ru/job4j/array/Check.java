package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
       for (int index = 1; index < data.length - 1; index++) {
            result = data[index] == data[0];
        }
        return result;
    }
}