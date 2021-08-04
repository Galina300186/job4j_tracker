package ru.job4j.oop;

public class Error {
   private boolean active;
    private int status;
    private String message;

    public Error(boolean active, int status, String message) {
        this.active = active;
        this.status = status;
        this.message = message;
    }

    public static void main(String[] args) {
        Error er = new Error(true, 1, "hi");
        er.printInfo();
    }

    public void printInfo() {
        System.out.println("Есть ошибка?: " + active);
        System.out.println("Статус: " + status);
        System.out.println("Сщщбщение: " + message);
    }
}


