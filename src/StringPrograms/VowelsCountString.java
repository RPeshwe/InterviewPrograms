package StringPrograms;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class VowelsCountString {

    public static void main(String[] args) {
        String s = "This is a really simple sentence";
        char [] charSeq = {'a','e','i','o','u'};
        List<Character> listOfChars = Arrays.asList('a','e','i','o','u');

        long x  = s.chars().filter(c -> !Character.isWhitespace(c))
                .filter(c -> c == 'a' || c== 'e' || c =='i' || c=='o' || c=='u').count();
                /*.mapToObj(c -> (char)c)
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));*/

        long v = s.chars().filter(c -> !Character.isWhitespace(c))
                .filter(c -> c != 'a' || c != 'e' || c !='i' || c !='o' || c !='u').count();

        System.out.println("Vowels: "+v);
    }
}
