package ru.job4j.oop;

public class DummyDic {
    public String engToRus() {
        return "Неизвестное слово. + eng";
    }

    public static void main(String[] args) {
        DummyDic petya = new DummyDic();
        String word = petya.engToRus();
        System.out.println(word);
    }
}
