package ru.job4j.oop;

public class DummyDic {
    public String engToRus() {
        String word = "Неизвестное слово. + eng";
        return word;
    }

    public static void main(String[] args) {
        DummyDic petya = new DummyDic();
        String word = petya.engToRus();
        System.out.println(word);
    }
}
