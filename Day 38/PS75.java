import java.util.Arrays;
import java.util.Scanner;

public class PS75 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        int [] result = new int [testCases];
        for (int i = 0; i < result.length; i++) {
            int chocolateSize = sc.nextInt();
            int unitsToEatTill = sc.nextInt();
            int unitsEaten = 0;
            while(chocolateSize>=unitsToEatTill){
                chocolateSize--;
                unitsEaten++;
            }
            if(chocolateSize==0){
                result[i] = unitsEaten;
            } else{
                result[i] = -1;
            }
        } 
        System.out.println(Arrays.toString(result));
        sc.close();       
    }
}
