package LegacyStylePrograms;

public class FrequencyOfWordsString {

    public static void main(String[] args) {
        String s = "Hello I am Using Java and also I am using core java";
        s = s.toLowerCase();
        String[] sArray = s.split("\\s");
        int[] frq = new int[sArray.length];

        for (int i = 0; i < sArray.length; i++) {
            frq[i] = 1;
            for (int j = i + 1; j < sArray.length; j++) {
                if (sArray[i].equals(sArray[j])) {
                    frq[i]++;
                    sArray[j] = "0";
                }
            }
        }

        for (int k = 0; k < frq.length; k++) {
            if (!sArray[k].equals("0") && frq[k] != 0) {
                System.out.println(sArray[k] + "---" + frq[k]);
            }
        }
    }
}
