package LegacyStylePrograms;

public class ConcurrentCharactersCountString {

    public static void main(String[] args) {
        String s = "aaabbbbccaaab";
        char prevChar = '\0';
        int count = 0;

        for (int i=0;i<s.length();i++){
            char currentChar = s.charAt(i);
            if (currentChar == prevChar){
                count++;
            }
            else {
                if (prevChar!='\0'){
                    System.out.println(prevChar+" "+count);
                }
                count = 1;
            }
            prevChar = currentChar;
        }

        if (prevChar!= '\0'){
            System.out.println(prevChar+" "+ count);
        }

    }
}
