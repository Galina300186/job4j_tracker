package ru.job4j.tracker;

public class ShowAction implements UserAction {
    @Override
    public String name() {
        return "Show Item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Show all items ===");
        String name = input.askStr("Enter name: ");
        Item[] item = tracker.findAll();
        System.out.println(name + item);
        return true;
    }

}
