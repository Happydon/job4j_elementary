package ru.job4j.oop;

public class DummyDic {
    public String engToRus(String eng) {
        String translation = "Неизвестное слово " + eng;
        System.out.println(translation);
        return translation;
    }
    public static void main(String[] args) {
        DummyDic samsung = new DummyDic();
        samsung.engToRus("Apple");
        samsung.engToRus("Potato");
        samsung.engToRus("Music");
    }
}
