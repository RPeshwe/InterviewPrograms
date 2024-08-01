package InterviewProgramsArray;

import java.util.Arrays;

public class SumOfAllElementsInArray {
    public static void main(String[] args) {

        int[] numArr = new int[]{1, 2, 3, 4, 5};

        long sum2 = Arrays.stream(numArr)
                .sum();

        System.out.print(sum2);
    }
}
