import java.util.Scanner;

public class PS38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String result = removeDuplicates(input);
        System.out.println(result);
        sc.close();
    }
    static String removeDuplicates(String input){
        StringBuilder output = new StringBuilder();
        boolean [] seen = new boolean[256];
        for(int i = 0; i < input.length(); i++){
            char ch = input.charAt(i);
            if(!seen[ch]){
                seen[ch] = true;
                output.append(ch);
            }
            else{
                output.deleteCharAt(i);
            }
        }
        return output.toString();
    }
}
