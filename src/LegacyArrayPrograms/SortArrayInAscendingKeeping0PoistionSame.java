package LegacyArrayPrograms;

public class SortArrayInAscendingKeeping0PoistionSame {

    public static void main(String[] args) {
        int [] arr = new int[]{5,3,2,0,4,0,1,0,0};
        int temp;

        for (int i=0;i<arr.length;i++){
            for (int j=i+1; j<arr.length; j++){
                if (arr[i] > arr[j] && arr[i]!=0 && arr[j]!=0){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int k =0; k<arr.length; k++){
            System.out.print(arr[k]);
        }
    }
}
