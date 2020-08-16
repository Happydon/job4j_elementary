package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;
import static org.hamcrest.core.IsNull.nullValue;

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
                "Menu." + System.lineSeparator() + "=== Exit ===" + System.lineSeparator()
        ));
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
                "Menu." + System.lineSeparator() + "=== Create a new Item ===" + System.lineSeparator() + "Menu." + System.lineSeparator() + "=== Show All Items ===" + System.lineSeparator() + "Item{id=1, name='28'}" + System.lineSeparator() + "Menu." + System.lineSeparator() + "=== Exit ===" + System.lineSeparator()
        ));
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
                "Menu." + System.lineSeparator() + "=== Create a new Item ===" + System.lineSeparator() + "Menu." + System.lineSeparator() + "=== Find Item by ID ===" + System.lineSeparator() + "Item{id=1, name='28'}" + System.lineSeparator() + "Menu." + System.lineSeparator() + "=== Exit ===" + System.lineSeparator()
        ));
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
                "Menu." + System.lineSeparator() + "=== Create a new Item ===" + System.lineSeparator() + "Menu." + System.lineSeparator() + "=== Find Item by Name ===" + System.lineSeparator() + "Item{id=1, name='28'}" + System.lineSeparator() + "Menu." + System.lineSeparator() + "=== Exit ===" + System.lineSeparator()
        ));
    }
}