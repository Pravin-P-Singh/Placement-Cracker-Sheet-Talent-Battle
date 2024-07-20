import java.util.Scanner;

public class PS40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String input = sc.next();
        System.out.println("Enter the substring to be removed");
        String substring = sc.next();
        System.out.println("Enter the new substring");
        String newsubstring = sc.next();
        replace(input, substring, newsubstring);
        sc.close();
    }

    static void replace(String input, String substring, String newsubString) {
        int i = input.indexOf(substring);
        String result = "";
        for (int j = 0; j < input.length(); j++) {
            if (j == i) {
                j += substring.length();
                result += newsubString;
            }
            result += input.charAt(j);
        }
        System.out.println(result);
    }
}
