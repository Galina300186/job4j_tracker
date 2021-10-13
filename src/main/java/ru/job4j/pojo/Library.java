package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book fantastic = new Book("Confrontation", 43);
        Book science = new Book("Sapiens", 30);
        Book child = new Book("Vinni Puh", 80);
        Book educational = new Book("Clean code", 62);
        Book[] volume = new Book[4];
        volume[0] = fantastic;
        volume[1] = science;
        volume[2] = child;
        volume[3] = educational;
        for (int index = 0; index < volume.length; index++) {
            Book vol = volume[index];
            System.out.println(vol.getName() + " " + vol.getCount());
        }
        System.out.println("Replace fantastic to educational");
        volume[0] = educational;
        volume[3] = fantastic;
        for (int index = 0; index < volume.length; index++) {
            Book vol = volume[index];
            String s1 = "Clean code";
                System.out.println(s1.equals(vol.getName()) + " " + vol.getCount());
            }
        }
    }
