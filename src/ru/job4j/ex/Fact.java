package ru.job4j.ex;

import java.util.Scanner;

public class Fact {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the number ");
        int n = Integer.parseInt(input.nextLine());
        System.out.println("Factorial of " + n + " is " + calc(n));
    }

    public static int calc(int n) {
        if (n < 0) {
        throw new IllegalArgumentException("Number should be equal or bigger than zero");
    }
        int rsl = 1;
        for (int index = 1; index <= n; index++) {
            rsl *= index;
        }
        return rsl;
    }
}