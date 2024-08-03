
import java.util.Scanner;
import java.util.Arrays;

public class PS67 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        int hits = 0;
        int[] result = new int[testCases];
        for (int i = 0; i < testCases; i++) {
            hits = 0;
            int s = sc.nextInt();
            int[] w = new int[3];
            for (int j = 0; j < w.length; j++) {
                w[j] = sc.nextInt();
            }
            int sum = 0;
            for (int j = 0; j < w.length; j++) {
                sum += w[j];
                if (sum == s || sum - s > 0) {
                    hits++;
                }
            }
            result[i] = hits;
        }
        System.out.println(Arrays.toString(result));
        sc.close();
    }
}
