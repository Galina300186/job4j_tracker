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
                "Menu." + ln
                        + "0. Edit Item" + ln
                        + "1. Exit Program" + ln
                        + "=== Edit Item ===" + ln
                        + "Заявка изменена успешно." + ln
                        + "Menu." + ln
                        + "0. Edit Item" + ln
                        + "1. Exit Program" + ln
        ));
    }

    @Test
    public void whenShowAll() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item x = tracker.add(new Item("abc"));
        Item y = tracker.add(new Item("def"));

        Input in = new StubInput(
                new String[]{"0", "1"}
        );
        UserAction[] actions = new UserAction[]{
                new ShowAll(out),
                new Exit(out)
        };
        new StartUI(out).init(in, tracker, actions);
        String ln = System.lineSeparator();
        assertThat(out.toString(), is(
                "Menu." + ln
                        + "0. Show Item" + ln
                        + "1. Exit Program" + ln
                        + "=== Show all items ===" + ln
                        + "Item{id=1, name='abc'}" + ln
                        + "Item{id=2, name='def'}" + ln
                        + "Menu." + ln
                        + "0. Show Item" + ln
                        + "1. Exit Program" + ln));
    }

    @Test
    public void whenFindByItem() {
        Output out = new StubOutput();
        Tracker tracker = new Tracker();
        Item item = new Item("Test1");
        tracker.add(item);
        FindByItem act = new FindByItem(out);
        act.execute(new StubInput(new String[]{item.getName()}), tracker);
        String ln = System.lineSeparator();
        String expect = new StringJoiner(ln, " ", ln)
                .add(item.getName())
                .toString();
        assertThat(out.toString(), is(
                "=== Find items by name ===" + ln + "Item{id=1, name='Test1'}" + ln));
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
        String ln = System.lineSeparator();
        assertThat(out.toString(), is(
                "Menu." + ln
                        + "0. Find Item by Id" + ln
                        + "1. Exit Program" + ln
        ));
    }
}

