package StringPrograms;

import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MaxAndMinOccuringCharcters {
    public static void main(String[] args) {
        String s = "GreaT";
        s = s.toLowerCase();
        var ff =  s.chars().mapToObj(c -> (char) c).count();
        System.out.println(ff);
    }
}
