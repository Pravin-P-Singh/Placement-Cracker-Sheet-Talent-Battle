import java.util.Scanner;

public class PS12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        while (num > 0) {
            int remainder = num % 10;
            sum += remainder;
            num = num / 10;
        }
        System.out.println(sum);
        sc.close();
    }
}
