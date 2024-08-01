package InterviewProgramsArray;

import java.util.Arrays;
import java.util.List;

public class AcsendingSortedArray {

    public static void main(String[] args) {
        int arr[]=new int[] {5,2,8,7,1};

       List<Integer> nn =  Arrays.stream(arr).boxed().sorted().toList();
       System.out.print(nn);
    }
}
