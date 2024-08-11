import java.util.Scanner;

public class PS72 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        sc.nextLine();
        StringBuilder sb = new StringBuilder();
        String result[] = new String[testCases];
        for (int i = 0; i < testCases; i++) {
            String [] query = sc.nextLine().split(" ");
            if(query[0].equals("+")){
                int index = Integer.parseInt(query[1]);
                sb.insert(index, query[2]);
            } else if(query[0].equals("?")){
                int index = Integer.parseInt(query[1]);
                int length = Integer.parseInt(query[2]);
                result[i] = sb.substring(index-1, length);
            }
        }
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
        sc.close();
    }
}
