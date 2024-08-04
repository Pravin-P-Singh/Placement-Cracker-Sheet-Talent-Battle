import java.util.Arrays;
import java.util.Scanner;

public class PS70 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int shiftByPositions = 1; // rotating in clockwise direction
        int[] arr = new int[size];
        int[] result = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            result[(i + shiftByPositions) % size] = arr[i];
        }
        System.out.println(Arrays.toString(result));
        sc.close();
    }
}
