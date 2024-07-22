import java.util.Scanner;

public class PS45 {
    public static void main(String[] args) {
        int maxElement = Integer.MIN_VALUE;
        int minElement = Integer.MAX_VALUE;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size = sc.nextInt();
        System.out.println("Enter the elements: ");
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            if (maxElement < arr[i]) {
                maxElement = arr[i];
            }
            if (minElement > arr[i]) {
                minElement = arr[i];
            }
        }
        System.out.println("Smallest Number: " + minElement);
        System.out.println("Largest Number: " + maxElement);
        sc.close();
    }
}
