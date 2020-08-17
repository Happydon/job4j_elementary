package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class TrackerTest {
    @Test
    public void whenReplace() {
        Tracker tracker = new Tracker();
        Item bug = new Item("Bug");
        tracker.add(bug);
        int id = bug.getId();
        Item bugWithDesc = new Item();
        bugWithDesc.setName("Bug with description");
        tracker.replace(id, bugWithDesc);
        assertThat(tracker.findById(id).getName(), is("Bug with description"));
    }

    @Test
    public void whenDelete() {
        Tracker tracker = new Tracker();
        Item bug = new Item("Bug");
        tracker.add(bug);
        tracker.delete(1);
        assertNull(tracker.findById(1));
    }

    @Test
    public void whenExit() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"0"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new ExitAction(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu."
                        + System.lineSeparator()
                        + "0. Exit"
                        + System.lineSeparator()
                        + "=== Exit ==="
                        + System.lineSeparator()));
    }
    @Test
    public void whenFindAllAction() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"0", "28", "1", "2"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(out),
                new ShowAction(out),
                new ExitAction(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu."
                        + System.lineSeparator()
                        + "0. Create"
                        + System.lineSeparator()
                        + "1. Show"
                        + System.lineSeparator()
                        + "2. Exit"
                        + System.lineSeparator()
                        + "=== Create a new Item ==="
                        + System.lineSeparator()
                        + "Menu."
                        + System.lineSeparator()
                        + "0. Create"
                        + System.lineSeparator()
                        + "1. Show"
                        + System.lineSeparator()
                        + "2. Exit"
                        + System.lineSeparator()
                        + "=== Show All Items ==="
                        + System.lineSeparator()
                        + "Item{id=1, name='28'}"
                        + System.lineSeparator()
                        + "Menu."
                        + System.lineSeparator()
                        + "0. Create"
                        + System.lineSeparator()
                        + "1. Show"
                        + System.lineSeparator()
                        + "2. Exit"
                        + System.lineSeparator()
                        + "=== Exit ==="
                        + System.lineSeparator()));
    }
    @Test
    public void whenFindByIDAction() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"0", "28", "1", "1", "2"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(out),
                new FindByIDAction(out),
                new ExitAction(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu."
                        + System.lineSeparator()
                        + "0. Create"
                        + System.lineSeparator()
                        + "1. Find by ID"
                        + System.lineSeparator()
                        + "2. Exit"
                        + System.lineSeparator()
                        + "=== Create a new Item ==="
                        + System.lineSeparator()
                        + "Menu."
                        + System.lineSeparator()
                        + "0. Create"
                        + System.lineSeparator()
                        + "1. Find by ID"
                        + System.lineSeparator()
                        + "2. Exit"
                        + System.lineSeparator()
                        + "=== Find Item by ID ==="
                        + System.lineSeparator()
                        + "Item{id=1, name='28'}"
                        + System.lineSeparator()
                        + "Menu."
                        + System.lineSeparator()
                        + "0. Create"
                        + System.lineSeparator()
                        + "1. Find by ID"
                        + System.lineSeparator()
                        + "2. Exit"
                        + System.lineSeparator()
                        + "=== Exit ==="
                        + System.lineSeparator()));
    }
    @Test
    public void whenFindByNameAction() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"0", "28", "1", "28", "2"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new CreateAction(out),
                new FindByNameAction(out),
                new ExitAction(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu."
                        + System.lineSeparator()
                        + "0. Create"
                        + System.lineSeparator()
                        + "1. Find by Name"
                        + System.lineSeparator()
                        + "2. Exit"
                        + System.lineSeparator()
                        + "=== Create a new Item ==="
                        + System.lineSeparator()
                        + "Menu."
                        + System.lineSeparator()
                        + "0. Create"
                        + System.lineSeparator()
                        + "1. Find by Name"
                        + System.lineSeparator()
                        + "2. Exit"
                        + System.lineSeparator()
                        + "=== Find Item by Name ==="
                        + System.lineSeparator()
                        + "Item{id=1, name='28'}"
                        + System.lineSeparator()
                        + "Menu."
                        + System.lineSeparator()
                        + "0. Create"
                        + System.lineSeparator()
                        + "1. Find by Name"
                        + System.lineSeparator()
                        + "2. Exit"
                        + System.lineSeparator()
                        + "=== Exit ==="
                        + System.lineSeparator()
                ));
    }
    @Test
    public void whenInvalidExit() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"1", "0" }
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new ExitAction(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                String.format(
                        "Menu.%n"
                                + "0. Exit%n"
                                + "Wrong input, you can select: 0 .. 0%n"
                                + "Menu.%n"
                                + "0. Exit%n"
                                + "=== Exit ===%n"
                )
        ));
    }
}