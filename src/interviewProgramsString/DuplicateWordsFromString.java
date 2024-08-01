package interviewProgramsString;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateWordsFromString {

    public static void main(String[] args) {
        String words = "Big black bug bit a big black dog on his big black nose";
        words = words.toLowerCase();
        List<String> separateWords = List.of(words.split("\\s"));

        Map<String, Long> frequncyMapOfWords = separateWords.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        //get duplicate words from map
        frequncyMapOfWords.entrySet().stream().filter(stringLongEntry -> stringLongEntry.getValue() > 1)
                .forEach(stringLongEntry -> System.out.println("Duplicate words: " +stringLongEntry.getKey()));

    }
}
