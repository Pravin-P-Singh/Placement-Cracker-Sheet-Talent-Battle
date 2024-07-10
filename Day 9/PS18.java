import java.util.Scanner;

public class PS18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        sc.close();

        int lcm = (y1 * y2) / gcd(y1, y2);
        int newDenominator = lcm;
        int newNumerator = x1 * (newDenominator / y1) + x2 * (newDenominator / y2);
        int gcd = gcd(newNumerator, newDenominator);
        newNumerator /= gcd;
        newDenominator /= gcd;
        System.out.println(newNumerator + "/" + newDenominator);

    }

    static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    } 
}
