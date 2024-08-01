import java.util.Scanner;

public class PS63 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        int[] result = new int[testCases];
        for (int i = 0; i < testCases; i++) {
            int w1, w2, x1, x2, M;
            w1 = sc.nextInt();
            w2 = sc.nextInt();
            x1 = sc.nextInt();
            x2 = sc.nextInt();
            M = sc.nextInt();

            if ((M * x1 <= (w2 - w1)) && ((w2 - w1) <= M * x2)) {
                result[i] = 1;
            } else {
                result[i] = 0;
            }

        }
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
