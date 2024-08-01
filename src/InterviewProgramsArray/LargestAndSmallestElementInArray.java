package InterviewProgramsArray;

import java.util.Arrays;
import java.util.Comparator;

public class LargestAndSmallestElementInArray {

    public static void main(String[] args) {
        int [] arr = new int[] { 1, 2, 3, 44, 5, -2 };
        int maxNumber =  Arrays.stream(arr)
                .boxed()
                .max(Comparator.comparingInt(Integer::valueOf)).get();
        int minNum = Arrays.stream(arr)
                .boxed()
                .min(Comparator.comparingInt(Integer::valueOf)).get();

        System.out.print("Max: "+maxNumber+ "\nMin: "+minNum);
    }
}
