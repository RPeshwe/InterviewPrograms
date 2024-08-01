package interviewProgramsString;

public class SwappingOfTwoStringsWithutUsingThirdVar {
    public static void main(String[] args) {
        String s = "Hello";
        String s1 = "Morning";

        s = s+s1; //HelloMorning
        s1 = s.substring(0, (s.length() - s1.length()));  //Hello
        System.out.println(s1);
        s = s.substring(s1.length());
        System.out.println(s);
    }
}
