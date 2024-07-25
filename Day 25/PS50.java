import java.util.Scanner;

public class PS50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input:");
        int size = sc.nextInt();
        int sum = 0;
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            sum += (int) Math.pow(arr[i], 2);
        }
        System.out.println("Output \n" + sum);
        sc.close();
    }
}
