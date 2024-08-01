package LegacyStylePrograms;

public class DuplicateCharcatersString {

    public static void main(String[] args) {

        String s = "Ramayan";
        s = s.toLowerCase();

        char[] ch = s.toCharArray();
        int count;

        System.out.println("Duplicate Characters are: ");
        for (int i = 1; i < ch.length; i++) {
            count = 1;
            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                    count++;
                    ch[j] = '0';
                }
            }
            if (count > 1 && ch[i] != '0') {
                System.out.println(ch[i]);
            }
        }

    }
}
