package interviewProgramsString;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MaxAndMinOoccringWordsFromString {

    public static void main(String[] args) {

        String word = "complie it online. The Java complier or java editor, tool helps you to create complie and run java program";
        word = word.toLowerCase();
        List<String> seperateWords = List.of(word.split("[ .,]+"));

        String maxWord = seperateWords.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .max(Comparator.comparingLong(Map.Entry::getValue))
                .get()
                .getKey();

        String minWord = seperateWords.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .min(Comparator.comparingLong(Map.Entry::getValue))
                .get()
                .getKey();

        System.out.println("Max Occ word: "+maxWord+"\nMinOccWord: "+minWord);
    }
}
