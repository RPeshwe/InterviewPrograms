package StringPrograms;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PunctuastionCharsInString {

    public static void main(String[] args) {
        String s = "He said, 'The mailman loves you;' I! heard it with my own ears";

        Map<Character, Long> mapOfPunctualChars = s.chars()
                .filter(c -> !Character.isWhitespace(c))
                .filter(c -> !Character.isLetter(c))
                .mapToObj(c -> (char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println(mapOfPunctualChars);
    }
}
