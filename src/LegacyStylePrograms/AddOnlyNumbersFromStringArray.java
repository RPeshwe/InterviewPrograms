package LegacyStylePrograms;

import java.util.Arrays;

public class AddOnlyNumbersFromStringArray {
    public static void main(String[] args) {
        String [] sArr = new String[]{"1","WE","22","op,","9"};
        String s = Arrays.toString(sArr);
        int sum = 0;
        String temp = "0";

        for (int i =0; i<s.length();i++){
           char ch = s.charAt(i);

           if (Character.isDigit(ch)){
               temp = temp + ch;
           }
           else {
               sum = sum + Integer.parseInt(temp);
               temp = "0";
           }
        }
        System.out.println(sum + Integer.parseInt(temp));
    }
}
