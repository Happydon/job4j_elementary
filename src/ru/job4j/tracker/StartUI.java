package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Scanner;

public class StartUI {
    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            System.out.print("Select: ");
            int select = Integer.valueOf(scanner.nextLine());
            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item();
                item.setName(name);
                tracker.add(item);
            } else if (select == 1) {
                tracker.findAll();
                System.out.print(Arrays.toString(tracker.findAll()));
            } else if (select == 2) {
                System.out.println("=== Edit Item ====");
                System.out.print("Enter ID and Name: ");
                int id = Integer.valueOf(scanner.nextLine());
                String name = scanner.nextLine();
                Item item = new Item();
                item.setName(name);
                tracker.replace(id, item);
                if (tracker.replace(id, item)) {
                    System.out.print("Operation was successful");
                } else {
                    System.out.print("Operation was not successful");
                }
            } else if (select == 3) {
                System.out.println("=== Delete Item ====");
                System.out.print("Enter ID: ");
                int id = Integer.valueOf(scanner.nextLine());
                tracker.delete(id);
                if (tracker.delete(id)) {
                    System.out.print("Operation was successful");
                } else {
                    System.out.print("Operation was not successful");
                }
            } else if (select == 4) {
                System.out.println("=== Find Item by ID ====");
                System.out.print("Enter ID: ");
                int id = Integer.valueOf(scanner.nextLine());
                tracker.findById(id);
                System.out.println(tracker.findById(id));
            } else if (select == 5) {
                System.out.println("=== Find Item by Name ====");
                System.out.print("Enter name: ");
                String key = scanner.nextLine();
                tracker.findByName(key);
                System.out.println(Arrays.toString(tracker.findByName(key)));
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
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}