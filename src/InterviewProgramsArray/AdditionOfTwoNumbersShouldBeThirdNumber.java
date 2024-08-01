package InterviewProgramsArray;

import java.util.stream.IntStream;

public class AdditionOfTwoNumbersShouldBeThirdNumber {

    public static void main(String[] args) {
        int[] a = new int[] { 1, 2, 3, 5, 6, 6, 7, 8, 15 };

        IntStream.range(0, a.length - 2)
                .filter(i -> a[i] + a[i+1] == a[i+2])
                .mapToObj(i -> a[i] + " " + a[i+1] + " " + a[i+2] )
                .forEach(System.out::println);
    }
}
