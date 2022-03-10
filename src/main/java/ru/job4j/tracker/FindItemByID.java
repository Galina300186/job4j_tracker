package ru.job4j.tracker;

public class FindItemByID implements UserAction {
    private final Output out;

    public FindItemByID(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Find Item by Id";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Find item by id ===");
        int id = input.askInt("Enter id: ");
        Item item = tracker.findById(id);
        if (item != null) {
        out.println(item);
        } else {
        out.println("Заявка с введенным id: " + id + " не найдена.");
        }
        return true;
    }
}

