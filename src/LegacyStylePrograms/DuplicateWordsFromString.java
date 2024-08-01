package LegacyStylePrograms;

public class DuplicateWordsFromString {

    public static void main(String[] args) {
        String s = "Big black bug bit a big black dog on his big black nose";
        s = s.toLowerCase();
        String[] sArray = s.split("\\s");
        int count;

        for (int i = 1; i < sArray.length; i++){
            count = 1;
            for (int j = i+1; j < sArray.length; j++){
                if (sArray[i].equals(sArray[j])){
                    count++;
                    sArray[j] = "0";
                }
            }
            if (count > 1 && !sArray[i].equals("0")){
                System.out.println(sArray[i]);
            }
        }

    }
}
