package pl.programator5;

import java.util.HashMap;
import java.util.Map;

public class MainMapy2 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        map.put("klucz", "wartość");
        map.put("klucz", "nowaWartość");
        map.put("klucz2", "nowaWartość");

        System.out.println(map.get("klucz"));

        System.out.println(map.get("klucz2"));


    }
}
