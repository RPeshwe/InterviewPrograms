package LegacyStylePrograms;

public class PalindromString {

    public static void main(String[] args) {
        String s = "aabbaa";
        s = s.toLowerCase();
        String rev = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            rev = rev + s.charAt(i);
        }

        if (rev.equals(s)){
            System.out.println("Palindrom");
        }
        else System.out.println("Not Palindrom");
    }
}
