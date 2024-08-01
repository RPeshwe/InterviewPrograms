package interviewProgramsString;

import java.util.Comparator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MaxAndMinOccuringCharcterString {

    public static void main(String[] args) {
        String s = "grass is greener on the other side";
        s = s.toLowerCase();

        Map<Character, Long> mapOfChars = s.chars()
                .filter(c -> !Character.isWhitespace(c))
                .mapToObj(ch -> (char)ch)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        //max occuring character
        Character maxOcc = mapOfChars.entrySet().stream().max(Comparator.comparingLong(Map.Entry::getValue)).get().getKey();
        //Min occ character
        Character minOcc = mapOfChars.entrySet().stream().min(Comparator.comparingLong(Map.Entry::getValue)).get().getKey();

        System.out.println("Max Occ char: "+maxOcc+ "\nminOcc Char: "+minOcc);

    }
}
