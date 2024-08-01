package StringPrograms;

import javax.naming.ldap.HasControls;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringTotalNumberOfChars {
    public static void main(String[] args) {
        String s = "The best of both worlds of the best people worlds of worlds characteristics";
        Map<Character, Long> mapOfCharCount = s.chars().mapToObj(c -> (char)c).filter(c -> !Character.isWhitespace(c))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(mapOfCharCount);

        s =s.toLowerCase();
        String[] sArray =  s.split("\\s");
        List<String> words = new ArrayList<>();
        Collections.addAll(words,sArray);
        var max = words.stream().max(Comparator.comparing(String::length)).get();
        var min = words.stream().min(Comparator.comparing(String::length)).get();
        Map<String, Long> mapOfWordsCount = words.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(max);
        System.out.println(min);

       var xx =  s.chars().boxed().toList();
       System.out.println(xx);

        var nonDuplicateWords = words.stream().distinct().collect(Collectors.toList());
        System.out.println(nonDuplicateWords);

        mapOfWordsCount.entrySet().stream()
                .filter(stringLongEntry -> stringLongEntry.getValue() > 1)
                        .forEach(stringLongEntry -> System.out.println("Words: " +stringLongEntry.getKey()));


    }
}
