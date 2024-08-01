package InterviewProgramsArray;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyOfElementsInArray {

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,2,4,5,4};

       Arrays.stream(arr)
               .boxed()
               .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
               .forEach((key, value) -> System.out.println(key + " --> " + value));

    }
}
