package ru.job4j.oop;

public class Cat {
    private String food;
    private String name;

    public void show() {
        System.out.println(this.name);
        System.out.println(this.food);

    }

    public void eat(String meat) {
        this.food = meat;
    }

    public void giveNick(String nick) {
        this.name = nick;

    }

    public static void main(String[] args) {

        System.out.println("There are gav's name.");
        Cat gav = new Cat();
        gav.giveNick("Гав");
        System.out.println("There are gav's food.");
        gav.eat("kotleta");
        gav.show();


        System.out.println("There are black's name.");
        Cat black = new Cat();
        black.giveNick("Чёрный");
        System.out.println("There are black's food.");
        black.eat("fish");
        black.show();

    }
}