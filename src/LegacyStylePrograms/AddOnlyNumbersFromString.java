package LegacyStylePrograms;

public class AddOnlyNumbersFromString {

    public static void main(String[] args) {
        String s = "test1223";
        int sum = 0;

        for (int i=0;i<s.length();i++){
            if (Character.isDigit(s.charAt(i))){
                int temp = Integer.parseInt(String.valueOf(s.charAt(i)));
                sum = sum + temp;
            }
        }
       System.out.println(sum);
    }
}
