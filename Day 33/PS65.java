import java.util.ArrayList;
import java.util.Scanner;

public class PS65 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
       ArrayList<String> tabletOrNot = new ArrayList<>();
        for (int i = 0; i < testCases; i++) {
            int availableLaptops = sc.nextInt();
            int budget = sc.nextInt();
            Integer maxArea = 0;
            boolean isBought = true;
            for (int j = 0; j < availableLaptops; j++) {
                int width = sc.nextInt();
                int height = sc.nextInt();
                int price = sc.nextInt();
                int currentArea = width*height;
                if(price<=budget && currentArea>maxArea){
                    maxArea = currentArea;
                } else{
                    isBought = false;
                }
            }
            if(isBought || maxArea>0){
                tabletOrNot.add(maxArea.toString());
            } else{
                tabletOrNot.add("No tablet");
            }
        }      
        for (int i = 0; i < tabletOrNot.size(); i++) {
            System.out.println(tabletOrNot.get(i));
        }
    }
}
