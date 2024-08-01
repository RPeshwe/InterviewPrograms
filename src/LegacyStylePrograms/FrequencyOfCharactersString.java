package LegacyStylePrograms;

public class FrequencyOfCharactersString {

    public static void main(String[] args) {
        String s = "welcome to java world";
        s = s.toLowerCase();
        char[] sArr = s.toCharArray();
        int[] freq = new int[sArr.length];

        for (int i = 0; i < sArr.length; i++) {
            freq[i] = 1;
            for (int j = i + 1; j < sArr.length; j++) {
                if (sArr[i] == sArr[j]) {
                    freq[i]++;
                    sArr[j] = '0';
                }
            }
        }

        for (int k = 0; k < freq.length; k++) {
            if (sArr[k] != '0' && sArr[k] != ' ') {
                System.out.println(sArr[k] + "--" + freq[k]);
            }
        }
    }
}
