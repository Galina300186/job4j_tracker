package ru.job4j.tracker;

public class EditItem implements UserAction{
    @Override
    public String name() {
        return "Edit Item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Edit Item ===");
        String name = input.askStr("Enter name: ");
        Item item = new Item(name);
        tracker.add(item);
        System.out.println("Заявка изменена успешно." + item);

        return true;
    }
}

