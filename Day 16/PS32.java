
import java.util.Scanner;

public class PS32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String result = "";
        for (char ch : input.toCharArray()) {
            if (checkVowel(ch)) {
                continue;
            }
            result += ch;
        }
        System.out.println(result);
        sc.close();
    }

    static boolean checkVowel(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
                || ch == 'O' || ch == 'U') {
            return true;
        }
        return false;
    }    
}
