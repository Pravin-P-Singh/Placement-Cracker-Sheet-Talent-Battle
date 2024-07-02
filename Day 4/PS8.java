
import java.util.Scanner;

public class PS8 {
    // only works when iota and imaginary terms are not involved
    // need to update in future
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a, b and c:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        double root1 = (-b + (Math.sqrt((Math.pow(b, 2)) - 4 * a * c))) / 2 * a;
        double root2 = (-b - (Math.sqrt((Math.pow(b, 2)) - 4 * a * c))) / 2 * a;

        if (root1 == root2) {
            System.out.printf("Roots are equal\nRoot 1 = %f root 2 = %f", root1, root2);
        } else {
            System.out.printf("Roots of the equation are \n Root 1 = %f \n Root 2 = %f", root1, root2);
        }
    }    
}
