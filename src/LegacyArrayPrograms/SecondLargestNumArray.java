package LegacyArrayPrograms;

public class SecondLargestNumArray {

    public static void main(String[] args) {
        int [] arr = new int[]{1,2,4,9,6};
        int length = arr.length;
        int temp;

        for (int i=0; i< arr.length; i++){
            for (int j=i+1; j<arr.length; j++){
                if (arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(arr[length - 2]);
    }
}
