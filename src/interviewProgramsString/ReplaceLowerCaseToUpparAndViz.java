package interviewProgramsString;

public class ReplaceLowerCaseToUpparAndViz {
    public static void main(String[] args) {
        String s = "Great Power";

        s.chars()
                .mapToObj(ch -> (char) ch)
                .map(
                        character -> Character.isLowerCase(character)
                                ? Character.toUpperCase(character)
                                : Character.toLowerCase(character)
                )
                .forEach(System.out::print);

    }
}
