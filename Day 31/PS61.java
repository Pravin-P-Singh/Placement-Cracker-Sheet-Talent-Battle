import java.util.Scanner;

public class PS61 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        int [] result = new int[testCases];
        for (int i = 0; i < testCases; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int sum = a+b;
            if(sum<3){
                result[i] = 1;
            }
            else if(sum>=3 && sum<=10){
                result[i] = 2;
            }
            else if(sum>=11 && sum<=60){
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
