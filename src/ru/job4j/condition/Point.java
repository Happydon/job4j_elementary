package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rsl = Math.sqrt(Math.pow(x2 - x1,2) + Math.pow(y2 - y1,2));
        return rsl;
    }

    public static void main(String[] args) {
        double result1 = Point.distance(3, 7, 7, 10);
        double result2 = Point.distance(0, 4, 8, 10);
        System.out.println("result (3, 7) to (7, 10) is " + result1);
        System.out.println("result (0, 4) to (8, 10) is " + result2);
    }
}
