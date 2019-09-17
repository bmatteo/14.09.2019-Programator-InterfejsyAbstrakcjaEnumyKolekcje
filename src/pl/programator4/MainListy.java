package pl.programator4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MainListy {
    public static void main(String[] args) {
        List<String> mojaList = new LinkedList<>();

        mojaList.add("ABC");
        mojaList.add(String.valueOf(5));
        mojaList.add("Złe Słowo");
        mojaList.add("Złe Słowo");
        mojaList.add(String.valueOf(true));
        mojaList.add("ABC");

        System.out.println(mojaList);

        for (int i = 0; i < mojaList.size(); i++) {
            if(mojaList.get(i).equals("Złe Słowo")) {
                mojaList.remove(i);
                i--;
            }
        }
        System.out.println(mojaList);

        MainListy.mojaMetoda(mojaList);


        MainListy.mojaMetoda2(mojaList);
    }

    public static void mojaMetoda(List<String> list) {

    }

    public static void mojaMetoda2(List<String> list) {

    }

    public static void mojaMetoda3(List<String> list) {

    }
}
