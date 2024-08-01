package InterviewProgramsArray;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateElementInArray {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 2, 3, 4, 4, 5};

        List<Integer> duplicate = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(integerLongEntry -> integerLongEntry.getValue() > 1)
                .map(Map.Entry::getKey)
                .toList();

        System.out.print(duplicate);
    }
}
