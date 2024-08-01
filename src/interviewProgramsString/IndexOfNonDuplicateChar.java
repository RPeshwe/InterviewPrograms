package interviewProgramsString;

import java.util.function.Function;
import java.util.stream.Collectors;

public class IndexOfNonDuplicateChar {

    public static void main(String[] args) {
        String s = "Google";
        s = s.toLowerCase();

        Character nonRep =  s.chars().mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(characterLongEntry -> characterLongEntry.getValue() == 1)
                .skip(1)
                .findFirst()
                .get()
                .getKey();

        int index =  s.indexOf(nonRep);

        System.out.println(index);
    }
}
