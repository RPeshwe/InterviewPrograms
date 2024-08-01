package LegacyStylePrograms;

public class StringReverse {
    public static void main(String[] args) {
        String s = "Hello All";
        String[] sArr = s.split("\\s");
        String reverse = "";

        for (String s1: sArr){
            for (int i=s1.length() -1 ; i >= 0; i--){
                reverse = reverse + s1.charAt(i);
            }
            System.out.print(reverse+" ");
            reverse = "";
        }
    }
}
