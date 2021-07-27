package ru.job4j.oop;

public class BallStory {
    public static void main(String[] args) {
        Ball kolobok = new Ball();
        Hare poprigaika = new Hare();
        Wolf serii = new Wolf();
        Fox sestrichka = new Fox();
        serii.tryEat(kolobok);
        sestrichka.tryEat(kolobok);
        poprigaika.tryEat(kolobok);
        kolobok.tryEat(kolobok);
    }
}
