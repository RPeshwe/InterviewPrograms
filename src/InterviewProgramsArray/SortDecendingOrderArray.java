package InterviewProgramsArray;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortDecendingOrderArray {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 8, 4, 6, 9};
        List<Integer> listNumbers = Arrays.stream(arr).boxed()
                .sorted((a, b) -> b - a)
                .collect(Collectors.toList());
        System.out.print(listNumbers);
    }
}
