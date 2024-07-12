import java.util.Scanner;

public class PS22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        int start = 2;
        int end = num - 2;
        boolean arePrimeNumbersFound = false;
        while (start <= end && end > 0) {
            if ((start + end) == num) {
                if (isPrime(start) && isPrime(end)) {
                    System.out.println(num + " can be expressed as a sum of " + start + " and " + end);
                    arePrimeNumbersFound = true;
                }
            }
            start++;
            end--;
        }
        if (!arePrimeNumbersFound) {
            System.out.println("No such prime numbers add upto make the original number");
        }
    }

    public static boolean isPrime(int num) {
        int c = 2;
        while (c * c <= num) {
            if (num % c == 0) {
                return false;
            }
            c++;
        }
        return true;
    }
}
