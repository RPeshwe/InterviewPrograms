package interviewProgramsString;

public class TotalNumberOfCharsString {
    public static void main(String[] args) {
        String s = "Hello How are you";
        s = s.toLowerCase();

        Long count =  s.chars().mapToObj(c -> (char)c)
                .filter(ch -> !Character.isWhitespace(ch))
                .count();

        System.out.print(count);
    }
}
