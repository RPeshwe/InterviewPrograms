package interviewProgramsString;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class UniqueCharactersFromString {

    public static void main(String[] args) {
        String s = "aabbddrtthyy";

        //Distinct will not work here ****** NO
        //s.chars().mapToObj(c -> (char)c).distinct().forEach(System.out::print);

        //This will get frequncy
        Map<Character, Long> mapOfCharcatersCount = s.chars()
                .mapToObj(c -> (char)c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        mapOfCharcatersCount.entrySet()
                .stream()
                .filter(characterLongEntry -> characterLongEntry.getValue() == 1)
                .forEach(characterLongEntry -> System.out.println("Unique Char "+characterLongEntry.getKey()));

    }
}
