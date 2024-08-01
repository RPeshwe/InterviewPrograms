package StringPrograms;

import java.util.Comparator;
import java.util.List;

public class LargeAndSmallWordsInString {

    public static void main(String[] args) {
        String s = "Hardships often prepare ordinary people for an extraordinary destiny ";
        s = s.toLowerCase();
        List<String> words = List.of(s.split("\\s"));
        String largerWord = words.stream().max(Comparator.comparing(String::length)).get();
        String smallWord = words.stream().min(Comparator.comparing(String::length)).get();

        System.out.println("Large wrd: "+largerWord);
        System.out.println("Small word: "+smallWord);
    }
}
