import java.util.Scanner;

public class PS38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String result = removeDuplicates(input);
        System.out.println(result);
        sc.close();
    }

    static String removeDuplicates(String input) {
        int[] count = new int[256];
        StringBuilder output = new StringBuilder();

        // First pass: count the occurrences of each character
        for (char ch : input.toCharArray()) {
            count[ch]++;
        }

        // Second pass: build the output string excluding characters that appear more
        // than once
        for (char ch : input.toCharArray()) {
            if (count[ch] == 1) {
                output.append(ch);
            }
        }

        return output.toString();
    }
}
