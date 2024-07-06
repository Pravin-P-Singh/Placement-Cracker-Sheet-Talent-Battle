import java.util.Scanner;

public class PS16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int result = findFactors(number);
        if (number == result) {
            System.out.println("Perfect Number");
        } else {
            System.out.println("Not a perfect number");
        }

    }

    public static int findFactors(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum;
    } 
}
