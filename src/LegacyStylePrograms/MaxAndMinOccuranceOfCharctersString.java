package LegacyStylePrograms;

public class MaxAndMinOccuranceOfCharctersString {

    public static void main(String[] args) {
        String s = "grass is greener on the other side";
        s = s.toLowerCase();
        char[] charArr = s.toCharArray();
        char minChar = s.charAt(0);
        char maxChar = s.charAt(0);
        int[] freq = new int[charArr.length];
        int min ,max ;

        for (int i = 0; i < charArr.length; i++){
            freq[i] = 1;
            for (int j = i+1; j < charArr.length; j++){
                if (charArr[i] == charArr[j] && charArr[i]!='0' && charArr[i]!= ' '){
                    freq[i]++;
                    charArr[j] = '0';
                }
            }
        }

        max = min = freq[0];
        for (int k = 0; k<freq.length; k++){
            if (min > freq[k] && charArr[k]!='0'){
                min = freq[k];
                minChar = charArr[k];
            }
            if (max < freq[k]){
                max = freq[k];
                maxChar = charArr[k];
            }
        }
        System.out.println("Max: "+maxChar+"\n"+"Min: "+minChar);
    }
}
