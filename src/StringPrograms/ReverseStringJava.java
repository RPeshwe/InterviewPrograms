package StringPrograms;

public class ReverseStringJava {

    public static void main(String[] args) {
        String s = "Kayak wow";
        String [] sArr = s.split("\\s");
        String reverseString = "";
        for (String sample: sArr){
            for (int i=sample.length() -1; i>=0; i--){
                reverseString = reverseString + sample.charAt(i);
                if (reverseString.equals(s)){
                    System.out.println("Palindrom String: "+s);
                }
            }
            System.out.println(reverseString);
        }
    }
}
