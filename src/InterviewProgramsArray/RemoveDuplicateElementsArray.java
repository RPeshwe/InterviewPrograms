package InterviewProgramsArray;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicateElementsArray {

    public static void main(String[] args) {
        int [] arr = new int[]{1,2,2,3,4,5,5,6};

       List<Integer> nonDuplicateNumbers =  Arrays.stream(arr).boxed()
                .distinct().toList();

       System.out.print(nonDuplicateNumbers);
    }
}
