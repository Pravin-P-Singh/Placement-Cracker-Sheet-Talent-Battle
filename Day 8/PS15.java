
import java.util.Scanner;


public class PS15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int sum = 0,temp = num;
        while(num>0){
            int remainder = num%10;
            sum+=fact(remainder);
            num=num/10;
        }
        if(sum==temp){
            System.out.println("Strong number");
        } else{
            System.out.println("Not a strong number");
        }
        sc.close();

    }   
    public static int fact(int number){
        int factorial = 1;
        for(int i = 1; i <= number; i++){
            factorial *= i;
        }
        return factorial;
    } 
}
