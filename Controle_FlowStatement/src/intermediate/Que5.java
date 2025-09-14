package intermediate;
import java.util.Scanner;

// Write a program to check whether a given character is a digit, alphabet, or special character.
public class Que5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any character: ");
        char ch = sc.next().charAt(0); // take single character input

        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println(ch + " is an Alphabet");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println(ch + " is a Digit");
        } else {
            System.out.println(ch + " is a Special Character");
        }

        sc.close();
    }
}
