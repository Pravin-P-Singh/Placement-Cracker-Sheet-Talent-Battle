import java.util.Scanner;

public class PS26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfPerson = sc.nextInt();
        int numberOfHandShakes = (numberOfPerson*(numberOfPerson-1))/2;
        System.out.println(numberOfHandShakes);
        sc.close();
    }
}
