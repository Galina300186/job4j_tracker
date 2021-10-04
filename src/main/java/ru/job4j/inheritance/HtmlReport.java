package ru.job4j.inheritance;

public class HtmlReport extends TextReport {

    public static void main(String[] args) {
        TextReport report = new TextReport();
        String text = report.generate("Report's name", "Report's body");
        System.out.println(text);
    }

    public String generate(String name, String body) {
        return "<h1>" + name + "</h1>" + "<br/>" + "<span>" + body + "</span>";
    }
}
