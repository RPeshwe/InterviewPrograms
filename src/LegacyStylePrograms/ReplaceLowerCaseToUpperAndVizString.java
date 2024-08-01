package LegacyStylePrograms;

public class ReplaceLowerCaseToUpperAndVizString {

    public static void main(String[] args) {
        String s = "Great Power";
        char[] ch = s.toCharArray();
        char[] ch1 = new char[ch.length];
        int temp = 0;

        for (char c : ch) {
            if (Character.isUpperCase(c)) {
                ch1[temp] = Character.toLowerCase(c);
                temp++;
            } else if (Character.isLowerCase(c)) {
                ch1[temp] = Character.toUpperCase(c);
                temp++;
            }
        }

        System.out.println(ch1);
    }
}
