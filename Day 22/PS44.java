
import java.util.Scanner;

public class PS44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        int isOdd = 0, isEven = 0;
        System.out.println("Enter elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        // checking the type of array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                isEven++;
            } else {
                isOdd++;
            }
        }
        System.out.println("Number of even elements: "+isEven);
        System.out.println("Number of odd elements: "+isOdd);
        
        sc.close();
    }   
}
