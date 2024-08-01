package LegacyStylePrograms;

public class MaxAndMinOccWordsString {

    public static void main(String[] args) {
        String s = "complie it online. The Java complier or java editor, tool helps you to create complie and run java program";
        s = s.toLowerCase();
        String [] sArr = s.split("[ .,]+");
        String maxWord = sArr[0],minWord = sArr[0];
        int max,min;
        int[] freq = new int[sArr.length];

        for (int i=0; i<sArr.length;i++){
            freq[i] = 1;
            for (int j = i+1; j<sArr.length; j++){
                if (sArr[i].equals(sArr[j]) && !sArr[i].equals("0") && !sArr[i].equals(" ")){
                    freq[i]++;
                    sArr[j] = "0";
                }
            }
        }

        max = min = freq[0];
        for (int k = 0; k< freq.length; k++){
            if (min > freq[k] && !sArr[k].equals("0")){
                min = freq[k];
                minWord = sArr[k];
            }
            if (max < freq[k]){
                max = freq[k];
                maxWord = sArr[k];
            }
        }

        System.out.println(maxWord+"\n"+minWord);
    }
}
