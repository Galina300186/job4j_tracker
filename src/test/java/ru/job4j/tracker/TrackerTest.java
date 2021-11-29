package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;


public class TrackerTest {
    @Test
    public void whenTestFindById() {
        Tracker tracker = new Tracker();
        Item bug = new Item(2);
        Item item = tracker.add(bug);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));
    }

    @Test
    public void whenTestFindAll() {
        Tracker tracker = new Tracker();
        Item first = new Item(89);
        Item second = new Item(90);
        tracker.add(first);
        tracker.add(second);
        Item result = tracker.findAll()[0];
        assertThat(result.getName(), is(first.getName()));
    }

    @Test
    public void whenTestFindByNameCheckArrayLength() {
        Tracker tracker = new Tracker();
        Item first = new Item(6, "A");
        Item second = new Item(3, "B");
        tracker.add(first);
        tracker.add(second);
        tracker.add(new Item(3, "C"));
        tracker.add(new Item(3, "D"));
        tracker.add(new Item(3, "E"));
        Item[] result = tracker.findByName(first.getName());
        assertThat(result.length, is(1));
    }

    @Test
    public void whenTestFindByNameCheckSecondItemName() {
        Tracker tracker = new Tracker();
        Item first = new Item(1, "A");
        Item second = new Item(2, "B");
        tracker.add(first);
        tracker.add(second);
        tracker.add(new Item(1, "A"));
        tracker.add(new Item(2, "B"));
        tracker.add(new Item(1, "C"));
        Item[] result = tracker.findByName(second.getName());
        assertThat(result[1].getName(), is(second.getName()));
    }
}