import java.util.Arrays;
import java.util.Scanner;

public class PS74 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        int [] result = new int[testCases];
        for (int i = 0; i < result.length; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int totalArea = n*m;
            int areaCovered2X2 = (n/2)*(m/2);
            int remainingArea = totalArea - (4*areaCovered2X2);
            int areaCovered1x1 = remainingArea/1;
            result[i] = areaCovered1x1;
        }
        System.out.println(Arrays.toString(result));
    }
}
