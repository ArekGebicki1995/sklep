package com.company;

/**
 * Created by ced on 2016-02-27.
 */
public class Zamowienie {
    public static void main(String[] args) {
        pozycja pierwsza = new pozycja("kawa", 2, 20);

        pozycja druga = new pozycja("mleko", 4, 2.3);

        System.out.println(pierwsza);
        System.out.println(druga);
    }
}