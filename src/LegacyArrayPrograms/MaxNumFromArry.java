package LegacyArrayPrograms;

public class MaxNumFromArry {

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,4,5,6,7};
        int max = arr[0];

        for (int i = 0; i< arr.length; i++){
            if (arr[i]>max){
                max = arr[i];
            }
        }

        System.out.println(max);
    }
}
