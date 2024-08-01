package interviewProgramsString;

public class SeperateCharactersFromString {
    public static void main(String[] args) {
        String s = "CHARACTERS";

        s.chars().mapToObj(c -> (char)c).forEach(System.out::println);
    }
}
