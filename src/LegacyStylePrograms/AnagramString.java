package LegacyStylePrograms;

import java.util.Arrays;

public class AnagramString {
    public static void main(String[] args) {
        String s = "grab and brag are one of the java dna avaj";
        s = s.toLowerCase();
        String[] sArr = s.split("\\s");

        for (int i = 0; i < sArr.length; i++) {
            for (int j = i + 1; j < sArr.length; j++) {
                char[] ch = sArr[i].toCharArray();
                char[] ch1 = sArr[j].toCharArray();
                Arrays.sort(ch);
                Arrays.sort(ch1);
                if (Arrays.equals(ch, ch1)) {
                    System.out.println("Anagram Strings: " + sArr[i] + " " + sArr[j]);
                }
            }
        }
    }
}
