
import java.util.Scanner;


public class PS19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int temp = num;
        int ans = 0;
        int numberOfDigits = digitCount(num);
        while(num>0){
            int lastDigit = num%10;
            ans += Math.round(Math.pow(lastDigit, numberOfDigits));
            num = num/10;
        }
        if(ans == temp){
            System.out.println("Armstrong number");
        } else{
            System.out.println("Not an Armstrong number");
        }
        sc.close();

    }
    public static int digitCount(int num){
        int count = 0;
        while(num>0){
            num=num/10;
            count++;
        }
        return count;
    }
}
