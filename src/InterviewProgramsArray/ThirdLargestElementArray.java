package InterviewProgramsArray;

import java.util.Arrays;

public class ThirdLargestElementArray {
    public static void main(String[] args) {
        int [] arr = new int[] { 1, 3, 5, 4, 6 };

        int thirdLarge = Arrays.stream(arr)
                .boxed()
                .sorted((a,b) -> b-a)
                .skip(2)
                .findFirst()
                .get();

        System.out.print(thirdLarge);
    }
}
