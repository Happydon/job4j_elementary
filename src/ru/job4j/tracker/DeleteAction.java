package ru.job4j.tracker;

public class DeleteAction implements UserAction {
    @Override
    public String name() {
        return "=== Delete Item ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id = input.askInt("Enter ID: ");
        if (tracker.delete(id)) {
            System.out.print("Operation was successful");
        } else {
            System.out.print("Operation was not successful");
        }
        return true;
    }
}
