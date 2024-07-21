import java.util.Scanner;

public class PS43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the array:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        boolean isOdd = false, isEven = false;
        System.out.println("Enter elements");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        // checking the type of array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                isEven = true;
            } else {
                isOdd = true;
            }
        }
        if (isOdd == true && isEven == true) {
            System.out.println("Mix");
        } else if (isEven) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
        sc.close();
    }
}
