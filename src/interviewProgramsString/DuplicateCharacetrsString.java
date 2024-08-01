package interviewProgramsString;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateCharacetrsString {

    public static void main(String[] args) {
        String s = "Ramayanr";
        s = s.toLowerCase();

        //To get frequency of charcaters in String
        Map<Character, Long> frequencyMap = s.chars().mapToObj(c ->(char)c)
                .filter(character -> !Character.isWhitespace(character)) //if needed to use this else no use
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        //To print duplicate characters from frequency map
        frequencyMap.entrySet().stream().filter(characterLongEntry -> characterLongEntry.getValue() > 1)
                .forEach(characterLongEntry -> System.out.println("Duplicates: " +characterLongEntry.getKey()));
    }
}
