package com.company;

/**
 * Created by ced on 2016-02-27.
 */
public class pozycja {
    private String nazwaTowaru;
    private int ilesztuk ;
    private double caena;

    public pozycja(String nazwaTowaru, int ilesztuk, double caena) {
        this.nazwaTowaru = nazwaTowaru;
        this.ilesztuk = ilesztuk;
        this.caena = caena;
    }

    public double obliczwartosc() {
        return caena*ilesztuk;
    }

    @Override
    public String toString() {
        return "pozycja{" +
                "nazwaTowaru='" + nazwaTowaru + '\'' +
                ", ilesztuk=" + ilesztuk +
                ", caena=" + caena +
                '}';
    }
}

