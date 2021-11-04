package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item[] findAll() {
        String itemsStr = "";
        Item[] itemsWithoutNull = new Item[this.items.length];
        int count = 0;
        for (int i = 0; i < size; i++) {
            Item item = items[i];
            if (items[i] != null) {
                System.out.println(items[i].getName());
                itemsWithoutNull[count] = this.items[i];
                count++;
            }
        }
        return Arrays.copyOf(itemsWithoutNull, count);
    }

    public Item[] findByName(String key) {
        return Arrays.copyOf(items, size);
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }
}