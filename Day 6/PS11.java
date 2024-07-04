import java.util.Scanner;

public class PS11{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        fibonacci(num);
        sc.close();
    }    
    public static void fibonacci (int num){
        int a=0,b=1,temp;
        for(int i = 0; i < num; i++){
            temp = a+b;
            b=a+b;
            System.out.print(b+" ");
            a = b;
        }    
    }
}
