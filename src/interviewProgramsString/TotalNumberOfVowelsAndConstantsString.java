package interviewProgramsString;

public class TotalNumberOfVowelsAndConstantsString {
    public static void main(String[] args) {
        String s = "This is a really simple sentence";
        s = s.toLowerCase();

        long vowelsCount = s.chars()
                .mapToObj(c -> (char) c)
                .filter(ch -> !Character.isWhitespace(ch))
                .filter(character -> "aeiou".indexOf(character) != -1)
                .count();
        long ConstantCount = s.chars()
                .mapToObj(c -> (char) c)
                .filter(ch -> !Character.isWhitespace(ch))
                .filter(character -> "aeiou".indexOf(character) == -1)
                .count();
        System.out.println(vowelsCount);
        System.out.print(ConstantCount);
    }
}
