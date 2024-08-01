package InterviewProgramsArray;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class PrintOddAndEvenNumbersFromArray {

    public static void main(String[] args) {
        int[] a = new int[] {1,2,3,4,4,5,6};

       List<Integer> evenNumbers =  Arrays.stream(a).boxed()
                .filter(integer -> integer % 2 == 0)
               .toList();

       List<Integer> oddNumbers = Arrays.stream(a)
               .boxed()
               .filter(integer -> integer % 2 != 0)
               .toList();

       System.out.println("Even Numbers: "+evenNumbers);
       System.out.print("Odd Numbers: "+oddNumbers);

    }
}
