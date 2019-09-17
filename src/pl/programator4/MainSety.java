package pl.programator4;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class MainSety {
    public static void main(String[] args) {
        Set<String> mojZbior = new TreeSet<>();

        mojZbior.add("ABC");
        mojZbior.add("ABC2");

        mojZbior.add("jsgdf");
        mojZbior.add("ghfdg");
        mojZbior.add("sdfgsd");
        mojZbior.add("vcbncvb");

        System.out.println(mojZbior.size());

        Iterator iteratorMojejListy = mojZbior.iterator();

        while (iteratorMojejListy.hasNext()) {
            System.out.println(iteratorMojejListy.next());
        }


    }
}
