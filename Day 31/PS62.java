import java.util.Scanner;

public class PS62 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        String[] result = new String[testCases];
        for (int i = 0; i < testCases; i++) {
            //N is number of people 
            //X is Gold
            //Y is cold carrying capacity of people
            int N = sc.nextInt();
            int X = sc.nextInt();
            int Y = sc.nextInt();
            N=N+1;
            if(N*Y>=X){
                result[i] = "YES";
            } else{
                result[i] = "NO";
            }
        }
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
        sc.close();
    }
}
