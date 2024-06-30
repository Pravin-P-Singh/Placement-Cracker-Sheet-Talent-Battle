
import java.util.Scanner;

public class PS4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number < 0) {
            System.out.println("Negative number");
        } else if (number > 0) {
            System.out.println("Positive number");
        } else {
            System.out.println("Neither positive nor negative");
        }

        sc.close();
    }
}
