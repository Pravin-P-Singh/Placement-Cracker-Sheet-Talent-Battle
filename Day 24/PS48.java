import java.util.ArrayList;
import java.util.Scanner;

public class PS48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        System.out.println("Enter the elements of array");
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        // O(n) complexity
        ArrayList<Integer> ans = new ArrayList<>();
        int key = 0;
        for (int i = 0; i < arr.length; i++) {
            if (key < arr[i]) {
                key = arr[i];
                ans.add(key);
            }
        }

        // printing the arraylist containing only unique elements
        System.out.println(ans);
    }
}
