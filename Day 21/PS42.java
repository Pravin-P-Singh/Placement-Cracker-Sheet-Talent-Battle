import java.util.Scanner;

public class PS42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of first array:");
        int firstSize = sc.nextInt();
        System.out.println("Enter size of second array:");
        int secondSize = sc.nextInt();
        int [] arrFirst = new int[firstSize];
        int [] arrSecond = new int[secondSize];
        System.out.println("Enter elements of first array: ");
        for(int i = 0; i < firstSize; i++){
            arrFirst[i] = sc.nextInt();
        }
        System.out.println("Enter elements of second array: ");
        for(int i = 0; i < secondSize; i++){
            arrSecond[i] = sc.nextInt();
        }

        //check both arrays
        for(int i = 0; i < arrFirst.length; i++){
            if(arrFirst[i]!=arrSecond[i]){
                System.out.println("Not same");
                return;
            }
        }
        System.out.println("Same");

    }    
}
