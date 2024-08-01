package LegacyStylePrograms;

public class LargestAndSmallestWordsString {

    public static void main(String[] args) {
        String s = "Hardships often prepare ordinary people for an extraordinary destiny";
        String [] sArray = s.split("\\s");
        String smallWord,largeWord;

        smallWord = largeWord = sArray[0];
        for (int i=0; i<sArray.length; i++){
            if (smallWord.length() > sArray[i].length()){
                smallWord = sArray[i];
            }
            if (largeWord.length() < sArray[i].length()){
                largeWord = sArray[i];
            }
        }

        System.out.println("Small Word: "+smallWord+ "\nLargeWord: "+largeWord);
    }
}
