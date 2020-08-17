package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int i = 0; i < value.length; i++) {
            if (value[i].equals(key)) {
                rsl = i;
                break;
            }
        }
        if (rsl == -1) {
            throw new ElementNotFoundException("There is no such element");
        }
        return rsl;
    }

    public static void main(String[] args) {
        String[] test = {"1", "2", "3", "4"};
        try {
            System.out.println(indexOf(test, "3"));
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
