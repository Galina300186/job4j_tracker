package ru.job4j.tracker;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.assertThat;

public class StartUITest {

    @Test
    public void whenReplaceItemTestOutputIsSuccessfully() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item one = tracker.add(new Item("test1"));
        String replaceName = "New Test Name";
        Input in = new StubInput(
                new String[]{"0", String.valueOf(one.getId()), replaceName, "1"}
        );
        UserAction[] actions = new UserAction[]{
                new ReplaceAction(out),
                new Exit(out)
        };
        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(out.toString(), is(
                "Menu:" + ln
                        + "0. Edit Item" + ln
                        + "1. Exit Program" + ln
                        + "=== Edit Item ===" + ln
                        + "Заявка изменена успешно." + ln
                        + "Menu:" + ln
                        + "0. Edit Item" + ln
                        + "1. Exit Program" + ln
        ));
    }

    @Test
    public void whenShowAll() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item x = new Item("abc");
        Item y = new Item("def");
        tracker.add(x);
        tracker.add(y);
        Input in = new StubInput(
                new String[]{"0", "1"}
        );
        UserAction[] actions = {
                new ShowAll(out), new Exit(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is("Menu:" + System.lineSeparator() + "0. Show Item" + System.lineSeparator() + "1. Exit Program" +
                System.lineSeparator() + "=== Show all items ===" + System.lineSeparator() +
                "Item{id=1, name='abc'}" + System.lineSeparator() +
                "Item{id=2, name='def'}" + System.lineSeparator() +
                "Menu:" + System.lineSeparator() + "0. Show Item" + System.lineSeparator() + "1. Exit Program" + System.lineSeparator()));
    }

    @Test
    public void whenFindByItem() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = new Item("Test1");
        tracker.add(item);
        FindByItem act = new FindByItem(out);
        act.execute(new StubInput(new String[]{item.getName()}), tracker);
        String expect = new StringJoiner(System.lineSeparator() ," ", System.lineSeparator())
        .add(item.getName())
                .toString();
        assertThat(out.toString(), is("=== Find items by name ===" + System.lineSeparator() + "Item{id=1, name='Test1'}" + System.lineSeparator()));
    }

    @Test
    public void whenFindByID() {
        Output out = new StubOutput();
        Input in = new StubInput(
        new String[]{"1", "1"}
        );
        Tracker tracker = new Tracker();
        UserAction[] actions = {
                new FindItemByID(out),
                new Exit(out)
        };
        new StartUI(out).init(in, tracker, actions);
        assertThat(out.toString(), is(
                "Menu." + System.lineSeparator()
                        + "0. Find Item by Id" + System.lineSeparator()
                        + "1. Exit Program" + System.lineSeparator()
        ));
    }
}

