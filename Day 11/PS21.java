
import java.util.Scanner;


public class PS21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(isPalindrome(num)){
            System.out.println("Palindrome");
        } else{
            System.out.println("Not a palindrome");
        }
        sc.close();
    }
    public static boolean isPalindrome(int num){
        int temp = num,ans=0;
        while(num>0){
            int lastDigit = num%10;
            ans = ans*10+lastDigit;
            num=num/10;
        }
        return ans==temp;
    }
}
