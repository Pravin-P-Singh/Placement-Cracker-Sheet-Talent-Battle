import java.util.Scanner;

public class PS54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size1 = sc.nextInt();
        int[] arr1 = new int[size1];
        boolean isDisjoint = false;
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        int size2 = sc.nextInt();
        int[] arr2 = new int[size2];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }
        // we can also use binary search -> n*logn -> time complexity
        // but here i am using bruteforce that is n*m time complexity
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    isDisjoint = true;
                    System.out.println("Disjoint");
                    break;
                }
            }
        }
        if (!isDisjoint) {
            System.out.println("Not disjoint");
        }
        sc.close();
    }
}
