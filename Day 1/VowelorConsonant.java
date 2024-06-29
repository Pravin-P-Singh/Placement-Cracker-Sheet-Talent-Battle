
import java.util.Scanner;

public class VowelorConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // System.out.println("Enter the character"); //use only if mentioned in the problem statement
        String input = sc.next().toLowerCase();
        char ch = input.charAt(0);
        
        if(ch=='a'|| ch=='e' || ch == 'i'|| ch == 'o' || ch=='u'){
            System.out.println("Vowel");
        } else if(ch>='a' && ch<='z'){
            System.out.println("Consonant");
        } else{
            System.out.println("Invalid input");
        }
        sc.close();
    }
}
