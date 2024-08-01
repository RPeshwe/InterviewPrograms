package InterviewProgramsArray;

import java.util.Arrays;

public class ReverseLastTwoElementsArray {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 5, 4, 6};

        int[] arr2 = Arrays.stream(arr)
                .boxed()
                .skip(arr.length - 2)
                .sorted((a, b) -> Integer.compare(b, a))
                .mapToInt(Integer::intValue)
                .toArray();

        System.arraycopy(arr2, 0, arr, arr.length - 2, 2);

        System.out.println(Arrays.toString(arr));
    }
}
