
import java.util.Scanner;

public class PS31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        StringBuilder toggledString = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (Character.isLowerCase(currentChar)) {
                toggledString.append(Character.toUpperCase(currentChar));
            } else if (Character.isUpperCase(currentChar)) {
                toggledString.append(Character.toLowerCase(currentChar));
            } else {
                toggledString.append(currentChar); // For non-alphabetic characters
            }
        }

        System.out.println(toggledString.toString());
    } 
}
