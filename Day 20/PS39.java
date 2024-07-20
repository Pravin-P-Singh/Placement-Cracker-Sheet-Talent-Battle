import java.util.Scanner;

public class PS39 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean checkAnagram = true;
        String input = sc.next();
        String anagram = sc.next();
        sc.close();
        if (input.length() < anagram.length()) {
            System.out.println("Not Anagram");
            return;
        }
        boolean[] seen = new boolean[256];
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            seen[ch] = true;
        }
        for (int i = 0; i < anagram.length(); i++) {
            char ch = anagram.charAt(i);
            if (seen[ch] == true) {
                seen[ch] = false;
            }
        }
        for (int i = 0; i < seen.length; i++) {
            if (seen[i] == true) {
                System.out.println("Not Anagram");
                checkAnagram = false;
                break;
            }
        }
        if (checkAnagram) {
            System.out.println("Anagram");
        }
        sc.close();
    }
}
