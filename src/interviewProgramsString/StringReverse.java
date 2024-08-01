package interviewProgramsString;

import java.util.List;
import java.util.stream.IntStream;

public class StringReverse {

    public static void main(String[] args) {
        /*String str = "Noorus Khan";
        int len = str.length();
        IntStream.range(0, len)
                .map(i -> len - 1 - i)
                .mapToObj(j->str.charAt(j))
                .forEach(System.out::print);*/

        String s = "Hello are you There";
        String[] sArr = s.split("\\s");
        String reverse;

        for (String s1 : sArr){
            StringBuilder buffer = new StringBuilder(s1);
            buffer.reverse();
            reverse = buffer.toString();
            System.out.print(reverse+ " ");
            reverse = "";
           /* for (int i=s1.length()-1; i>=0; i--){
                reverse = reverse + s1.charAt(i);
            }
            System.out.print(reverse + " ");
            reverse = "";*/
        }

        //use java stream
        /*String s = "Hello are you There";
        List<String> words = List.of(s.split("\\s"));
        words.forEach(s1 ->
                IntStream.range(0, s1.length())
                        .map(i -> s1.length() - 1 - i)
                        .mapToObj(s1::charAt)
                        .forEach(System.out::print));

        System.out.println();

        String s1 = "Hello";
        IntStream.range(0, s1.length())
                .map(i -> s1.length()-1-i)
                .mapToObj(s1::charAt)
                .forEach(System.out::print);*/
    }
}
