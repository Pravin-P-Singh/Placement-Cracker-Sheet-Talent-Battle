import java.util.Scanner;

public class PS57 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        String[] result = new String[testCases];
        for (int i = 0; i < result.length; i++) {
            int numberOfQuestions = sc.nextInt();
            int correct = sc.nextInt();
            int passingMarks = sc.nextInt();
            int negativeMarks = numberOfQuestions - correct;
            if ((correct * 3) - negativeMarks >= passingMarks) {
                result[i] = "pass";
            } else {
                result[i] = "fail";
            }
        }
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
        sc.close();
    }
}
