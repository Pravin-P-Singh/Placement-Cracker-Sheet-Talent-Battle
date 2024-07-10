
import java.util.Scanner;


public class PS17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        findFactors(num);
        sc.close();
    }   
    public static void findFactors(int num){
        for(int i = 1; i <= num; i++){
            if(num%i==0){
                System.out.print(i+" ");
            }
        }
    }
}
