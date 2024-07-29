import java.util.Arrays;
import java.util.Scanner;

public class PS55 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int ans = 0;
        int[] arr1 = new int[size];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        Arrays.sort(arr1);
        int[] arr2 = new int[size];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }
        Arrays.sort(arr2);

        for (int i = 0; i < size; i++) {
            ans += arr1[arr1.length - i - 1] * arr2[arr2.length - i - 1];
        }
        System.out.println(ans);
        sc.close();

    }
}
