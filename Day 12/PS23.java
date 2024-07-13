import java.util.Scanner;

public class PS23{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int ans = convertZeroestoOnes(num);
        System.out.println(ans);
        sc.close();
    }

    static int convertZeroestoOnes(int num) {
        int ans = 0;
        if (num == 0) {
            return 1;
        }
        while (num > 0) {
            int lastDigit = num % 10;
            if (lastDigit == 0) {
                lastDigit = 1;
            }
            ans = ans * 10 + lastDigit;
            num = num / 10;
        }
        return reverse(ans);
    }

    static int reverse(int num) {
        int rev = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            rev = rev * 10 + lastDigit;
            num = num / 10;
        }
        return rev;
    }
}