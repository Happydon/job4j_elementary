package ru.job4j.tracker;

public class EditAction implements UserAction {
    private final Output out;

    public EditAction(Output out) {
        this.out = out;
    }
    @Override
    public String name() {
        return "Edit";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Edit Item ====");
        int id = input.askInt("Enter ID: ");
        String name = input.askStr("Enter Name: ");
        Item item = new Item();
        item.setName(name);
        if (tracker.replace(id, item)) {
            out.println("Operation was successful");
        } else {
            out.println("Operation was not successful");
        }
        return true;
    }
}
