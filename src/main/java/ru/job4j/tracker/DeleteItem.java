package ru.job4j.tracker;

public class DeleteItem implements UserAction {
    @Override
    public String name() {
        return "Delete Item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Delete Item ===");
        String id = input.askStr("Enter id: ");
        int idd = Integer.parseInt(id);
        tracker.delete(idd);
        System.out.println("Заявка удалена успешно.");

        return true;
    }
}

