package ru.job4j.oop;

public class DummyDic {
    public String engToRus() {
        String word = "eng";
        return word;
    }

    public static void main(String[] args) {
        DummyDic petya = new DummyDic();
        String eng = petya.engToRus();
        System.out.println("Неизвестное слово. " + eng);
    }
}
