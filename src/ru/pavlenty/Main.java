package ru.pavlenty;

public class Main {

    public static void main(String[] args) {

        String a = new String("Hello");
        String b = new String("Hello");

        System.out.println(a==b); // false
        System.out.println(a.equals(b)); // true

        // Литеральное присвоение
        String c = "Moscow";
        String d = "Moscow";
        // пул

        System.out.println(c==d); // true

        // Строки immutable
        String str = "sdfsdfsdf"; // объект класса String
        System.out.println(str.hashCode());

        str += "ddddddd"; // объект класса String
        System.out.println(str.hashCode());

        // StringBuilder - быстрее
        // StringBuffer - в потоках

        StringBuffer strb = new StringBuffer("adfgadg");
        System.out.println(strb.hashCode());
        strb.append("adfgadfgadfgadfgadgf");
        System.out.println(strb.hashCode());

        String abc = strb.toString();





    }
}
