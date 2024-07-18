
import java.util.Scanner;

public class PS36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String result="";
        sc.close();
        for(int i = 0; i < input.length(); i++){
            if(i==0 || i==input.length()-1){
                result+=Character.toUpperCase(input.charAt(i));
            } else{
                result+= input.charAt(i);
            }
        }
        System.out.println(result);
    }    
}
