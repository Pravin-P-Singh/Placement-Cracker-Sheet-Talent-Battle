import java.util.Scanner;

public class PS28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        for(int i = input.length()-1; i>=0; i--){
            System.out.print(input.charAt(i));
        }
        sc.close();
    }    
}
