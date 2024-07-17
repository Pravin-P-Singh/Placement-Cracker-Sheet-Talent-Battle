
import java.util.Scanner;

public class PS34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        System.out.println(removeBrackets(input));

    }

    static String removeBrackets(String input) {
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '(' || input.charAt(i) == ')') {
                continue;
            }
            result += input.charAt(i);
        }
        return result;
    }    
}
