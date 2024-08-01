package InterviewProgramsArray;

import java.util.Arrays;
import java.util.List;

public class ReverseOrderArray {
    public static void main(String[] args) {
        int [] arr = new int[] {1,2,3,4,5};

         List<Integer> gg =  Arrays.stream(arr).boxed()
                .sorted((a,b) -> Integer.compare(b, a))
                .toList();

         System.out.print(gg);
    }
}
