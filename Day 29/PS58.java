import java.util.Scanner;

public class PS58 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        int [] result = new int[testCases];
        for (int i = 0; i < testCases; i++) {
            int bucketLimit = sc.nextInt();
            int waterFilled = sc.nextInt();
            result[i] = bucketLimit-waterFilled;
        }       
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        } 
    }
}
