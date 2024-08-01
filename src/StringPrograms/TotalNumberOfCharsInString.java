package StringPrograms;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TotalNumberOfCharsInString {

    public static void main(String[] args) {
        String sample = "The best of both worlds";
        Map<Character, Long> mapOFCharsCount = sample.chars().filter(c -> !Character.isWhitespace(c))
                .mapToObj(c -> (char)c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())
                );
        System.out.println(mapOFCharsCount);
    }
}
