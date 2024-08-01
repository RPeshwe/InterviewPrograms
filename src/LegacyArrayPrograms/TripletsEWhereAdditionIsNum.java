package LegacyArrayPrograms;

public class TripletsEWhereAdditionIsNum {
    public static void main(String[] args) {
        int arr[] = new int[]{1, 2, 4, 5, 3, 10};
        int sum ;
        int num = 8;

        for (int i=0; i<arr.length; i++){
            for (int j = i+1; j<arr.length; j++){
                for (int k = j+1; k<arr.length;k++){
                    sum = arr[i] + arr[j] + arr[k];
                    if (sum == num){
                        System.out.println(arr[i]+" "+arr[j]+" "+arr[k]);
                    }
                }
            }
        }
    }
}
