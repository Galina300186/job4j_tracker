package ru.job4j.oop;

public class Student {

    public void music(String lyrics) {
        System.out.println("I can sign a song : " + lyrics);
    }


    public static void main(String[] args) {
        Student petya = new Student();
        Student kolya = new Student();
        String sing = "ЖЕЛТЫЕ ТЮЛЬПАНЫ";
        String song = "I believe, I can fly";
        petya.music(song);
        petya.music(sing);
        kolya.music(sing);

    }
}