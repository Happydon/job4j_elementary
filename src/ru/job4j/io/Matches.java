package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        int matches = 11;
        int count = 0;
        int player = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Добро пожаловать. ");
        while (matches > 0) {
            System.out.print("Уберите от 1 до 3х спичек ");
            int take = Integer.valueOf(input.nextLine());
            if (0 < take && take < 4) {
                matches -= take;
                count++;
                System.out.print("Осталось " + matches + " спичек ");
            } else {
                System.out.print("Введите корректное количесво спичек. ");
            }
        }
        if (count % 2 == 0) {
            player = 2;
        } else {
            player = 1;
        }
        System.out.print("Поздравляем с победой, игрок № " + player);
    }
}
