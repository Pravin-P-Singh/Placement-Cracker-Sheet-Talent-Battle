import java.util.Scanner;
public class PS53 {
    // https://www.youtube.com/watch?v=Y6B-7ZctiW8 reference solution
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] arr = new int [size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int leftProduct = 1, rightProduct = 1;
        int ans = arr[0];
        for (int i = 0; i < arr.length; i++) {
            leftProduct = leftProduct==0?1:leftProduct;
            rightProduct = rightProduct==0?1:rightProduct;

            leftProduct*=arr[i];
            rightProduct*=arr[arr.length-1-i];
            ans = Math.max(ans,Math.max(leftProduct, rightProduct));
        }
        System.out.println(ans);
        sc.close();
    }    
}
