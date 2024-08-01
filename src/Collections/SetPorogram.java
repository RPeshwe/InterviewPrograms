package Collections;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.DoubleStream;

public class SetPorogram {

    public static void main(String[] args) {

        Set<String> hasSet = new HashSet<>();
        hasSet.add("zRush");
        hasSet.add("Neha");
        hasSet.add("Adi");
        System.out.println(hasSet);

        TreeSet<String> treeSetCom = new TreeSet<>(Comparator.comparing(s -> s.contains("Neha")));
        treeSetCom.addAll(hasSet);
        System.out.println(treeSetCom);

        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Neha");
        treeSet.add("Rushikesh");
        treeSet.add("Vanmala");
        treeSet.add("Sudhir");
        treeSet.add("Adil");

        System.out.println(treeSet);
    }
}
