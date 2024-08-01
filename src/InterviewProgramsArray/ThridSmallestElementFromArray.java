package InterviewProgramsArray;

import java.util.Arrays;

public class ThridSmallestElementFromArray {
    public static void main(String[] args) {
        int[] arr = new int[] { 1, 4, 2, 5, 7, 3 };

        int thirdSmallest =  Arrays.stream(arr).boxed().sorted().skip(2).findFirst().get();
        System.out.print(thirdSmallest);
    }
}
