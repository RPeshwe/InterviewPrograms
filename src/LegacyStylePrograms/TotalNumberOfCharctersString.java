package LegacyStylePrograms;

public class TotalNumberOfCharctersString {

    public static void main(String[] args) {
        String s = "Match";
        int count = 0;

        for (int i = 0; i<s.length(); i++){
            if (s.charAt(i)!=' '){
                count++;
            }
        }
        System.out.println(count);
    }
}
