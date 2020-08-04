package ru.job4j.tracker;

public class DeleteAction implements UserAction {
    private final Output out;

    public DeleteAction(Output out) {
        this.out = out;
    }
    @Override
    public String name() {
        return "Delete";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Delete Item ====");
        int id = input.askInt("Enter ID: ");
        if (tracker.delete(id)) {
            System.out.print("Operation was successful");
        } else {
            System.out.print("Operation was not successful");
        }
        return true;
    }
}
