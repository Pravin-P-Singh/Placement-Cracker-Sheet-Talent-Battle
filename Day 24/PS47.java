
import java.util.Scanner;

public class PS47 {
    public static void main(String[] args) {
        int digits = 0, previousIndex = 0, longestPalindrome = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        System.out.println("Enter the elements: ");
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if (isPalindrome(arr[i])) {
                if (digitCount(arr[previousIndex]) > digitCount(arr[i])) {
                    longestPalindrome = arr[previousIndex];
                } else {
                    longestPalindrome = arr[i];
                }
            }
        }
        System.out.println(longestPalindrome);
        sc.close();
    }

    public static int digitCount(int num) {
        return Math.round((int) Math.log10(num));
    }

    public static boolean isPalindrome(int num) {
        int ans = 0, temp = num;
        while (num > 0) {
            int lastDigit = num % 10;
            ans = ans * 10 + lastDigit;
            num = num / 10;
        }
        return (temp == ans);
    }
}
