import java.util.Scanner;

public class PS30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int count = 0;
        for(char ch: input.toCharArray()){
            count++;
        }
        System.out.println(count);
        sc.close();
    }    
}
