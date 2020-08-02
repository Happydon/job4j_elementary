package ru.job4j.tracker;

public class StartUI {
    public static void createItem(Input input, Tracker tracker) {
        System.out.println("=== Create a new Item ====");
        String name = input.askStr("Enter name: ");
        Item item = new Item();
        item.setName(name);
        tracker.add(item);
    }
    public static void showAll(Tracker tracker) {
        System.out.print("=== Show All Items ====");
        Item[] item = tracker.findAll();
        for (int i = 0; i < item.length; i++) {
            System.out.println(item[i]);
        }
    }
    public static void editItem(Input input, Tracker tracker) {
        System.out.println("=== Edit Item ====");
        int id = input.askInt("Enter ID: ");
        String name = input.askStr("Enter Name: ");
        Item item = new Item();
        item.setName(name);
        if (tracker.replace(id, item)) {
            System.out.print("Operation was successful");
        } else {
            System.out.print("Operation was not successful");
        }
    }
    public static void deleteItem(Input input, Tracker tracker) {
        System.out.print("=== Delete Item ====");
        int id = input.askInt("Enter ID: ");
        if (tracker.delete(id)) {
            System.out.print("Operation was successful");
        } else {
            System.out.print("Operation was not successful");
        }
    }
    public static void findItemById(Input input, Tracker tracker) {
        System.out.print("=== Find Item by ID ====");
        int id = input.askInt("Enter ID: ");
        Item item = tracker.findById(id);
        if (item != null) {
            System.out.println(item);
        } else {
            System.out.println("Заявка по id не найдена");
        }
    }
    public static void findItemByName(Input input, Tracker tracker) {
        System.out.print("=== Find Item by Name ====");
        String key = input.askStr("Enter name: ");
        Item[] item = tracker.findByName(key);
        if (item.length != 0) {
            for (int i = 0; i < item.length; i++) {
                System.out.println(item[i]);
            }
        } else {
            System.out.println("Заявка по id не найдена");
        }
    }
    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = input.askInt("Select: ");
            if (select == 0) {
                StartUI.createItem(input, tracker);
            } else if (select == 1) {
                StartUI.showAll(tracker);
            } else if (select == 2) {
                StartUI.editItem(input, tracker);
            } else if (select == 3) {
                StartUI.deleteItem(input, tracker);
            } else if (select == 4) {
                StartUI.findItemById(input, tracker);
            } else if (select == 5) {
                StartUI.findItemByName(input, tracker);
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