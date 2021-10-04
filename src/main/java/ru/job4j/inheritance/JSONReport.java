package ru.job4j.inheritance;

public class JSONReport extends TextReport {

    public static void main(String[] args) {
        TextReport report = new TextReport();
        String text = report.generate("Report's name", "Report's body");
        System.out.println(text);
    }
    @Override
    public String generate(String name, String body) {
        return name + ":name"  + "," + body + ":body";
    }

}

