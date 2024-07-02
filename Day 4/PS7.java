import java.util.Scanner;

public class PS7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter month:");
        int month = sc.nextInt();
        System.out.print("Enter year:");
        int year = sc.nextInt();

        switch (month) {
            case 1:
                System.out.println(31);
                break;
            case 2:
                if (year % 4 == 0) {
                    if (year % 100 == 0 && year != 1600 && year != 2000) {
                        System.out.println(28);
                        break;
                    }
                    if (year % 400 == 0) {
                        System.out.println(29);
                        break;
                    } else {
                        System.out.println(29);
                    }
                } else {
                    System.out.println(28);
                    break;
                }
                break;
            case 3:
                System.out.println(31);
                break;
            case 4:
                System.out.println(30);
                break;
            case 5:
                System.out.println(31);
                break;
            case 6:
                System.out.println(30);
                break;
            case 7:
                System.out.println(31);
                break;
            case 8:
                System.out.println(31);
                break;
            case 9:
                System.out.println(30);
                break;
            case 10:
                System.out.println(31);
                break;
            case 11:
                System.out.println(30);
                break;
            case 12:
                System.out.println(31);
                break;
            default:
                System.out.println("Please enter a month from 1-12!");
                break;// not necessary though
        }
    }
}
