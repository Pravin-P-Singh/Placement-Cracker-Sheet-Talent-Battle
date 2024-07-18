
import java.util.Scanner;


public class PS35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        System.out.println(returnSum(input));
        sc.close();
    }

    static int returnSum(String input) {
        int sum = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch >= '0' && ch <= '9') {
                sum += (int) ch;
                sum = sum - 48;
            }
        }
        return sum;
    }    
}
