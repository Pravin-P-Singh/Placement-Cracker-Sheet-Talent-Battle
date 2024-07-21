import java.util.Scanner;

public class PS41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.close();
        String input = sc.next();
        String check = sc.next();
        boolean isMatching = false;
        if (input.length() != check.length()) {
            System.out.println("No they don't match");
            return;
        }
        for (int i = 0; i < input.length(); i++) {
            if (check.charAt(i) == input.charAt(i)) {
                isMatching = true;
                continue;
            } else {
                if (input.charAt(i) == '*') {
                    isMatching = true;
                    continue;
                } else if (input.charAt(i) == '?') {
                    isMatching = true;
                    continue;
                } else {
                    isMatching = false;
                }
            }
        }
        if (isMatching) {
            System.out.println("Yes they match");
        } else {
            System.out.println("No they don't match");
        }
        sc.close();
    }
}
