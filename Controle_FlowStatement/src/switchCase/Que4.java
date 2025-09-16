package switchCase;
import java.util.Scanner;
//Input a digit (0–9) and print it in words.
public class Que4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a digit (0-9): ");
        int num = sc.nextInt();

        switch(num) {
            case 0: System.out.println("Zero"); break;
            case 1: System.out.println("One"); break;
            case 2: System.out.println("Two"); break;
            case 3: System.out.println("Three"); break;
            case 4: System.out.println("Four"); break;
            case 5: System.out.println("Five"); break;
            case 6: System.out.println("Six"); break;
            case 7: System.out.println("Seven"); break;
            case 8: System.out.println("Eight"); break;
            case 9: System.out.println("Nine"); break;
            default: System.out.println("Invalid digit!");
        }
        sc.close();
    }
}
