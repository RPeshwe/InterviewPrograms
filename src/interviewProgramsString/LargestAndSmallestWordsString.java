package interviewProgramsString;

import java.util.Comparator;
import java.util.List;

public class LargestAndSmallestWordsString {

    public static void main(String[] args) {
        String word = "Hardships often prepare ordinary people for an extraordinary destiny";
        word = word.toLowerCase();
        List<String> seperateWords = List.of(word.split("\\s"));

        String largerWord = seperateWords.stream().max(Comparator.comparing(String::length)).get();
        String smallWord = seperateWords.stream().min(Comparator.comparing(String::length)).get();

        System.out.println("Larger Word: "+largerWord+"\nSmall Word: "+smallWord);
    }
}
