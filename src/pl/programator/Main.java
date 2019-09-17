package pl.programator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        IKalkulator kalkulator;
        kalkulator = new Kalkulator(); //później tej linijki nie będzie

        int wynik = kalkulator.dodaj(1,4);

        System.out.println(wynik);
    }
}
