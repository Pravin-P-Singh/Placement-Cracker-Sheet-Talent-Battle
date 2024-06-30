
import java.util.Scanner;

public class ASCIIVALUE {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.next().trim();
        char ch = input.charAt(0);

        System.out.println((int) ch);
        sc.close(); 
    }
}
