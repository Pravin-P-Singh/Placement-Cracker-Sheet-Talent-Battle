import java.util.Scanner;

public class PS25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();
        double result = Math.PI * radius * radius;
        System.out.printf("%.2f", result);
        sc.close();
    }    
}
