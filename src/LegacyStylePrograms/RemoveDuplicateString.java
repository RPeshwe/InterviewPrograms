package LegacyStylePrograms;

import java.util.Arrays;

public class RemoveDuplicateString {

    public static void main(String[] args) {
        String[] sArray = new String[] {"java", "am", "using", "java"};

        // Find the length of the original array
        int originalLength = sArray.length;

        // Iterate through the array
        for (int i = 0; i < originalLength; i++) {
            for (int j = i + 1; j < originalLength; j++) {
                // Compare elements at index i and j
                if (sArray[i].equals(sArray[j])) {
                    // If a duplicate is found, move the last element to the duplicate's position
                    sArray[j] = sArray[originalLength - 1];
                    originalLength--; // Reduce the length of the array
                    j--; // Decrement j to recheck the current index
                }
            }
        }

        // Create a new array with the unique elements
        String[] uniqueArray = new String[originalLength];
        System.arraycopy(sArray, 0, uniqueArray, 0, originalLength);

        // Print the unique elements
        System.out.println("Array with duplicates: ");
        for (String s : sArray) {
            System.out.print(s + " ");
        }

        System.out.println("\nArray without duplicates: ");
        for (String unique : uniqueArray) {
            System.out.print(unique + " ");
        }
    }
}
