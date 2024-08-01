package interviewProgramsString;

import java.util.Arrays;

public class AddOnlyNumbersFromString {

    public static void main(String[] args) {
        String s = "a123abhirushi55";

        int sum = s.chars()
                .filter(Character::isDigit)  // Filter out non-digit characters
                .mapToObj(Character::toString) // Convert to String
                .mapToInt(Integer::parseInt)  // Parse to int
                .sum();                      // Sum the integers

        System.out.println("Sum of numbers: " + sum);

        String[] sArr = new String[] { "a", "1", "23", "abhi", " rushi", "55" };

        int sumX = Arrays.stream(sArr)
                .filter(str -> str.trim().matches("\\d+")) // Filter out numeric elements
                .mapToInt(Integer::parseInt) // Convert to int
                .sum(); // Sum the integers

        System.out.println("Sum of numbers: " + sumX);

    }
}
