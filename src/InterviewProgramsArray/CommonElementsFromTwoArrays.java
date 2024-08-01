package InterviewProgramsArray;

import java.util.HashSet;
import java.util.Set;

public class CommonElementsFromTwoArrays {

    public static void main(String[] args) {
        int [] arr = new int[]{1,2,5,4,8};
        int [] arr2 = new int[]{1,3,7,8,9};

        Set<Integer> commonElements = new HashSet<>();

        for (int k : arr) {
            for (int i : arr2) {
                if (k == i) {
                    commonElements.add(k);
                    break;
                }
            }
        }

        System.out.println(commonElements);
    }
}
