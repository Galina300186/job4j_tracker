package ru.job4j.tracker;

public class FindByItem implements UserAction {
    @Override
    public String name() {
        return "Find Item by ID";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Find items by name ===");
        String name = input.askStr("Enter name: ");
        Item[] item = tracker.findByName(name);
        System.out.println(item);

        return true;
    }
}

