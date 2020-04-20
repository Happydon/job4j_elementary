package ru.job4j;

public class Converter {
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

    public static int dollarToRuble(int value) {
        int rsl = value * 70;
        return rsl;
    }
    public static int euroToRuble(int value) {
        int rsl = value * 80;
        return rsl;
    }

    public static int funtToRuble(int value) {
        int rsl = value * 70;
        return rsl;
    }
    public static void main(String[] args) {
        int in = 160;
        int expected = 2;
        int out = rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("160 rubles are 2. Test result : " + passed);
        int euro = Converter.rubleToEuro(160);
        System.out.println("160 rubles are " + euro + " euro.");
        in = 280;
        expected = 4;
        System.out.println("280 rubles are 4. Test result : " + passed);
        int dollar = Converter.rubleToDollar(280);
        System.out.println("280 rubles are " + dollar + " dollar.");
        in = 900;
        expected = 10;
        System.out.println("900 rubles are 10. Test result : " + passed);
        int funt = Converter.rubleToFunt(900);
        System.out.println("900 rubles are " + funt + " funt.");
    }
}
