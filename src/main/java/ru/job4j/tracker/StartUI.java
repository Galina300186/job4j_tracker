package ru.job4j.tracker;

import com.sun.source.util.SourcePositions;

import java.util.Scanner;

public class StartUI {
    public static void createItem(Input input, Tracker tracker) {
        System.out.println("=== Create a new Item ===");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        tracker.add(item);
        System.out.println("Добавленная заявка: " + item);
    }

    public static void findAllItem(Input input, Tracker tracker) {
        System.out.println("=== Show all items ===");
        String name = input.askStr("Enter name: ");
        Item[] item = tracker.findAll();
        System.out.println(name + item);
    }

    public static void replaceItem(Input input, Tracker tracker) {
        System.out.println("=== Edit Item ===");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        tracker.add(item);
        System.out.println("Заявка изменена успешно." + item);
    }

    public static void deleteItem(Input input, Tracker tracker) {
        System.out.println("=== Delete Item ===");
        String id = input.askStr("Enter id: ");
        int idd = Integer.parseInt(id);
        tracker.delete(idd);
        System.out.println("Заявка удалена успешно.");
    }

    public static void findByIdItem(Input input, Tracker tracker) {
        System.out.println("=== Find item by id ===");
        String id = input.askStr("Enter id: ");
        int idd = Integer.parseInt(id);
        Item item = tracker.findById(idd);
        System.out.println(item);
    }

    public static void findByNameItem(Input input, Tracker tracker) {
        System.out.println("=== Find items by name ===");
        String name = input.askStr("Enter name: ");
        Item[] item = tracker.findByName(name);
        System.out.println(item);
    }

    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            System.out.print("Select: ");
            int select = input.askInt("Select: ");
            if (select == 0) {
                StartUI.createItem(input, tracker);
            } else if (select == 1) {
                StartUI.findAllItem(input, tracker);
            } else if (select == 2) {
                StartUI.replaceItem(input, tracker);
            } else if (select == 3) {
                StartUI.deleteItem(input, tracker);
            } else if (select == 4) {
                StartUI.findByIdItem(input, tracker);
            } else if (select == 5) {
                StartUI.findByNameItem(input, tracker);
            } else if (select == 6) {
                System.out.println("=== Exit program ===");
                run = false;
            }
        }
    }

    private void showMenu() {
        String[] menu = {
                "Add new Item", "Show all items", "Edit item",
                "Delete item", "Find item by id", "Find items by name",
                "Exit Program"
        };
        System.out.println("Menu:");
        for (int i = 0; i < menu.length; i++) {
            System.out.println(i + ". " + menu[i]);
        }

    }

    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}