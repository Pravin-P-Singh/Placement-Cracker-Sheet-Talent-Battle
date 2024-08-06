import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        String [] result = new String[testCases];
        for (int i = 0; i < testCases; i++) {
            String input = sc.next();
            StringBuilder sb = new StringBuilder(input);
            char ch = sb.charAt(0);
            if(ch=='+'){
                int index = (int)input.charAt(1)-'0';
                sb.insert(index,input.substring(2));
            }
            if(ch=='?'){
                int startIndex = (int)ch-'0';
                int endIndex = (int)input.charAt(2)-'0';
                    result[i] = sb.subSequence(startIndex, endIndex).toString();
            }
            result[i] = sb.toString();
        }
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
