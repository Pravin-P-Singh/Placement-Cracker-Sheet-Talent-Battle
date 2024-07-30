
import java.util.Scanner;


public class PS60 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        int [] A = new int[7];
        String [] result = new String[testCases];
        for (int i = 0; i < testCases; i++) {
            int count_1 = 0;
            int count_0 = 0;
            for (int j = 0; j < args.length; j++) {
                A[j] = sc.nextInt();
                if(A[j]==0){
                    count_0++;
                } else{
                    count_1++;
                }
            }
            if(count_1>count_0){
                result[i]="Yes";
            } else{
                result[i]="No";
            }
        }
        for (int i = 0; i < result.length; i++) {
            System.out.println(result);
        }

    }
}
