package StringPrograms;

import javax.swing.plaf.IconUIResource;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateWordsInString {
    public static void main(String[] args) {
        String originalString = "Big black bug bit a big black dog on his big black nose";
        originalString = originalString.toLowerCase();
        List<String> words = List.of(originalString.split("\\s"));

        Map<String, Long> duplicateFrqu = words.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("Frequ: "+duplicateFrqu);
        int count;

        String seperateWords[] = originalString.split(" ");

        for (int i = 0; i < seperateWords.length; i++) {
            count = 1;
            for (int j = i + 1; j < seperateWords.length; j++) {
                if (seperateWords[i].equals(seperateWords[j])) {
                    count++;
                    seperateWords[j] = "0";
                }
            }
            if (count > 1 && seperateWords[i] != "0") {
                System.out.println(seperateWords[i]);
            } else if (count == 0 && seperateWords[i] == "0") {
                System.out.println("No Duplicates presnet");
            }
        }
    }
}
