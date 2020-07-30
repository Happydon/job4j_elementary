package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        int matches = 11;
        boolean count = false;
        int player = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Добро пожаловать. ");
        while (matches > 0) {
            System.out.print("Уберите от 1 до 3х спичек ");
            int take = Integer.valueOf(input.nextLine());
            if (0 < take && take < 4) {
                matches -= take;
                count = !count;
                System.out.print("Осталось " + matches + " спичек ");
            } else {
                System.out.print("Введите корректное количесво спичек. ");
            }
        }
        if (count) {
            player = 1;
        } else {
            player = 2;
        }
        System.out.print("Поздравляем с победой, игрок № " + player);
    }
}
