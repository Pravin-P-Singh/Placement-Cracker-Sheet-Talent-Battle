import java.util.Scanner;

public class PS3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next().toLowerCase();
        char ch = input.charAt(0);

        if(ch>='a' && ch <='z'){
            System.out.println("Alphabet");
        } else{
            System.out.println("Not an alphabet");
        }
        sc.close();
    }
}
