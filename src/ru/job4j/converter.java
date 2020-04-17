package ru.job4j;

public class converter {
    public static int rubleToEuro(int value) {
        int rsl = value / 80;
        return rsl;
    }

    public static int rubleToDollar(int value) {
        int rsl = value / 70;
        return rsl;
    }
    public static int rubleToFunt(int value) {
        int rsl = value / 90;
        return rsl;
    }

    public static int DollarToRuble(int value) {
        int rsl = value * 70;
        return rsl;
    }
    public static int EuroToRuble(int value) {
        int rsl = value * 80;
        return rsl;
    }

    public static int FuntToRuble(int value) {
        int rsl = value * 70;
        return rsl;
    }
    public static void main(String[] args) {
        int Euro = converter.rubleToEuro(160);
        int Dollar = converter.rubleToDollar(280);
        int Funt = converter.rubleToFunt(900);
        System.out.println("160 rubles are " + Euro + " euro.");
        System.out.println("280 rubles are " + Dollar + " dollar.");
        System.out.println("900 rubles are " + Funt + " funt.");
    }
}
