package ru.job4j.oop.max;

public class Reduce {
    private int[] array;
    public void to(int[] arrayData) {
        array = arrayData;
    }
    public void print() {
        for (int index = 0; index < array.length; index++) {
            System.out.println(array[index]);
        }
    }
    public static void main(String[] args) {
        int[] arrayData = {1, 2, 3};
        Reduce reduce = new Reduce();
        reduce.to(arrayData);
        reduce.print();
    }
}
