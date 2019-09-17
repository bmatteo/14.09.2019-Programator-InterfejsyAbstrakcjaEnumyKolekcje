package pl.programator5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MainMapy {
    public static void main(String[] args) {
        Map<String, Pet> mojaMapa = new HashMap<>();

        Pet pet = new Pet();
        pet.name = "Reksio";

        Pet pet2 = new Pet();
        pet2.name = "Reks";

        String tajnyKlucz = "tajnyKlucz";
        mojaMapa.put(tajnyKlucz, pet);
        mojaMapa.put("tajnyKluczDwa", pet2);

        if(mojaMapa.get("tajnyKlucz") == null) {
            System.out.println("Masz nulla");
        } else {
            System.out.println(mojaMapa.get("tajnyKlucz").name);
        }

        Set mojePary = mojaMapa.entrySet();

        Iterator iteratorMojegoSetaZParami = mojePary.iterator();

        while (iteratorMojegoSetaZParami.hasNext()) {
            Map.Entry mojWpis = (Map.Entry) iteratorMojegoSetaZParami.next();

            System.out.println(mojWpis.getKey());
            Pet mojPies = (Pet) mojWpis.getValue();
            System.out.println(mojPies.name);
        }

    }
}
