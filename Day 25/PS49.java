import java.util.Scanner;

public class PS49 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr1 = new int[size];
        int[] arr2 = new int[size];
        int scalarProduct = 0;
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }
        for (int i = 0; i < arr1.length; i++) {
            scalarProduct += arr2[i] * arr1[arr1.length - i - 1];
        }
        System.out.println(scalarProduct);
        sc.close();

    }
}
