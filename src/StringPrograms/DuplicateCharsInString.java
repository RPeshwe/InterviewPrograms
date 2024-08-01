package StringPrograms;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateCharsInString {

    public static void main(String[] args) {
        String s = "Ramayananyrm";
        s = s.toLowerCase();

        Map<Character , Long> x =  s.chars().mapToObj(c -> (char)c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(x);

        char[] ch = s.toCharArray();
        List<Character> list = new ArrayList<>();

        int count;
        for (int i =0;i<ch.length;i++){
            count = 1;
            for (int j = i + 1;j<ch.length;j++){
                if(ch[i] == ch[j]){
                    count++;
                    ch[j] = '0';
                }
            }
            if (count > 1 && ch[i]!='0'){
                System.out.println(ch[i]);
            }
        }
    }
}
