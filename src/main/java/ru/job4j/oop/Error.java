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

    public Error() {

    }

    public static void main(String[] args) {
        Error er = new Error(true, 1, "hi");
        Error er1 = new Error(false, 0, "bye");
        Error er2 = new Error();
        er.printInfo();
        er1.printInfo();
        er2.printInfo();
    }

    public void printInfo() {
        System.out.println("Есть ошибка?: " + active);
        System.out.println("Статус: " + status);
        System.out.println("Сообщение: " + message);
    }
}


