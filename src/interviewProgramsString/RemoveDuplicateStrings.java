package interviewProgramsString;

import java.util.List;

public class RemoveDuplicateStrings {

    public static void main(String[] args) {
        String s = "Java am using java";
        s=s.toLowerCase();
        List<String> words = List.of(s.split("\\s"));

       List<String> nonDuplicate =  words.stream().distinct().toList();
       System.out.println(nonDuplicate);
    }
}
