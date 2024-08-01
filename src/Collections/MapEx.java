package Collections;

import java.util.*;

public class MapEx {
    public static void main(String[] args) {

        HashMap<Integer, String> mapDE = new HashMap<>();
        mapDE.put(1, "Ravi");
        mapDE.put(5, "Hel");
        mapDE.put(3, "Mjh");
        mapDE.put(4, "Ravi");

        mapDE.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(System.out::println);

        mapDE.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(System.out::println);
        Collection<String> b =  mapDE.values();
        Set<Integer> mapSet = mapDE.keySet();

        System.out.println(b);

       for (Map.Entry<Integer, String> m: mapDE.entrySet()){
           System.out.println(m.getKey());
           System.out.println(m.getValue());
       }


        TreeMap<Integer, String> mapdd = new TreeMap<>();
        mapdd.put(1, "Ravi");
        mapdd.put(4, "Rushi");
        mapdd.put(2, "Neha");

        System.out.println(mapdd);
    }
}
