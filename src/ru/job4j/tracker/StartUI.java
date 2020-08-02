package ru.job4j.tracker;

import java.util.Arrays;

public class StartUI {
    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = Integer.valueOf(input.askStr("Select: "));
            if (select == 0) {
                String name = input.askStr("=== Create a new Item ====" + "/n" + "Enter name: ");
                Item item = new Item();
                item.setName(name);
                tracker.add(item);
            } else if (select == 1) {
                Item[] item = tracker.findAll();
                for (int i = 0; i < item.length; i++) {
                    System.out.println(item[i]);
                }
            } else if (select == 2) {
                int id = input.askInt("=== Edit Item ====" + "/n" + "Enter ID: ");
                String name = input.askStr("Enter Name: ");
                Item item = new Item();
                item.setName(name);
                tracker.replace(id, item);
                if (tracker.replace(id, item)) {
                    System.out.print("Operation was successful");
                } else {
                    System.out.print("Operation was not successful");
                }
            } else if (select == 3) {
                int id = input.askInt("=== Delete Item ====" + "/n" + "Enter ID: ");
                tracker.delete(id);
                if (tracker.delete(id)) {
                    System.out.print("Operation was successful");
                } else {
                    System.out.print("Operation was not successful");
                }
            } else if (select == 4) {
                int id = input.askInt("=== Find Item by ID ====" + "/n" + "Enter ID: ");
                Item item = tracker.findById(id);
                if (item != null) {
                    System.out.println(item);
                } else {
                    System.out.println("Заявка по id не найдена");
                }
            } else if (select == 5) {
                System.out.println("=== Find Item by Name ====");
                System.out.print("Enter name: ");
                String key = input.askStr("=== Find Item by Name ====" + "/n" + "Enter name: ");
                Item[] item = tracker.findByName(key);
                if (item != null) {
                    for (int i = 0; i < item.length; i++) {
                        System.out.println(item[i]);
                    }
                } else {
                    System.out.println("Заявка по id не найдена");
                }
            } else if (select == 6) {
                run = false;
            }
        }
    }

    private void showMenu() {
        System.out.println("Menu.");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}