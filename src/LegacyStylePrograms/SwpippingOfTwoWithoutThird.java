package LegacyStylePrograms;

public class SwpippingOfTwoWithoutThird {
    public static void main(String[] args) {
        String s = "Hello";
        String s1 = "Morning";

        s = s+s1;
        s1 = s.substring(0,(s.length() - s1.length()));
        System.out.println("S1: "+s1);
        s = s.substring(s1.length());
        System.out.println("S: "+s);
    }
}
