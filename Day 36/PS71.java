import java.util.Scanner;
import java.util.Arrays;

public class PS71 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        int[] result = new int[testCases];
        for (int i = 0; i < testCases; i++) {
            int size = sc.nextInt();
            int[] arr = new int[size];
            for (int j = 0; j < arr.length; j++) {
                arr[j] = sc.nextInt();
            }
            // processing the results
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (boast(arr, arr[j])) {
                    count++;
                }
            }
            result[i] = count;
        }
        System.out.println(Arrays.toString(result));
        sc.close();
    }

    public static boolean boast(int[] arr, int element) {
        int smallerOrEqual = 0, bigger = 0;
        for (int i = 0; i < arr.length; i++) {
            int currentElement = arr[i];
            if (currentElement <= element) {
                smallerOrEqual++;
            } else {
                bigger++;
            }
        }
        return smallerOrEqual > bigger;

    }
}
