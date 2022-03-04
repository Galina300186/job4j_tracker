package ru.job4j.tracker;

public class FindItemByID implements UserAction {
    @Override
    public String name() {
        return "Find Item by Id";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Find item by id ===");
        String id = input.askStr("Enter id: ");
        int idd = Integer.parseInt(id);
        Item item = tracker.findById(idd);
        System.out.println(item);

        return true;
    }
}

