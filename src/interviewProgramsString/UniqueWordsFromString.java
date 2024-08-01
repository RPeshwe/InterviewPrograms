package interviewProgramsString;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class UniqueWordsFromString {

    public static void main(String[] args) {
        String words = "Hey RV hey RV how RV is";
        words = words.toLowerCase();
        List<String> seperateWords = List.of(words.split("\\s"));

        Map<String, Long> mapOfWords = seperateWords.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        mapOfWords.entrySet()
                .stream()
                .filter(stringLongEntry -> stringLongEntry.getValue() == 1)
                .forEach(stringLongEntry -> System.out.println("Unique Word: "+stringLongEntry.getKey()));
    }
}
