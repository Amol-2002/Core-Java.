//A restaurant menu:
//
//Pizza - $250
//
//Burger - $100
//
//Pasta - $150
//
//Salad - $120
//
//Input a number and print the item and its price.

package switchCase;
import java.util.Scanner;

public class Que5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu:");
        System.out.println("1. Pizza - ₹250");
        System.out.println("2. Burger - ₹100");
        System.out.println("3. Pasta - ₹150");
        System.out.println("4. Salad - ₹120");
        System.out.print("Enter choice: ");
        int choice = sc.nextInt();

        switch(choice) {
            case 1: System.out.println("Pizza - ₹250"); break;
            case 2: System.out.println("Burger - ₹100"); break;
            case 3: System.out.println("Pasta - ₹150"); break;
            case 4: System.out.println("Salad - ₹120"); break;
            default: System.out.println("Invalid choice!");
        }
        sc.close();
    }
}
