import java.util.Scanner;

public class PS59 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testcases = sc.nextInt();
        int[] result = new int[testcases];
        for (int i = 0; i < testcases; i++) {
            int mass = sc.nextInt();
            int height = sc.nextInt();
            int BMI = mass / (int) Math.pow(height, 2);
            if (BMI <= 18) {
                result[i] = 1;
            } else if (BMI >= 19 && BMI <= 24) {
                result[i] = 2;
            } else if (BMI >= 25 && BMI <= 29) {
                result[i] = 3;
            } else {
                result[i] = 4;
            }
        }
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}