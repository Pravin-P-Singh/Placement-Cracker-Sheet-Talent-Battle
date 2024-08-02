import java.util.Scanner;

public class PS66 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        String [] result = new String[testCases];
        for (int i = 0; i < testCases; i++) {
            String input1 = sc.next();
            String input2 = sc.next();
            if(canBePalindrome(input1,input2)){
                result[i] = "Yes";
            } else{
                result[i] = "No";
            }
        }
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
    static boolean canBePalindrome(String input1,String input2){
        for (int i = 0; i < input1.length(); i++) {
            for (int j = 0; j < input2.length(); j++) {
                if(input1.charAt(i)==input2.charAt(j)){
                    return true;
                }
            }
        }
        return false;
    }
}
