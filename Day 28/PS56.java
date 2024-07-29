import java.util.Scanner;

public class PS56 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();
        boolean isFactorOfAllThree = false;
        for (int i = 2; i <= num1; i++) {
            isFactorOfAllThree = num1 % i == 0 ? (num2 % i == 0 ? (num3 % i == 0 ? true : false) : false) : false;
            if (isFactorOfAllThree) {
                break;
            }
        }
        if (isFactorOfAllThree) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
