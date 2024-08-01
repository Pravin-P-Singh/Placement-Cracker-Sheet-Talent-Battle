
import java.util.Scanner;

public class PS64 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        String[] result = new String[testCases];
        for (int i = 0; i < testCases; i++) {
            String input = sc.next();
            if (isGood(input)) {
                result[i] = "Good";
            } else {
                result[i] = "Bad";
            }
        }
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
        sc.close();
    }

    static boolean isGood(String p) {
        if (p.isEmpty()) {
            return false;
        }
        if (p.startsWith("101") || p.startsWith("010")) {
            return true;
        }
        return isGood(p.substring(1));
    }
}
