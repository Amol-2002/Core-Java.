//Input a letter grade (A, B, C, D, F) and print the corresponding message:
//
//A → Excellent
//
//B → Good
//
//C → Average
//
//D → Poor
//
//F → Fail
package switchCase;
import java.util.Scanner;
public class Que3 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter and alphaber bet ween A to F");
		char alpha =sc.next().charAt(0);
		
		switch(alpha) {
			case 'A':
				System.out.println("Excellent");
				break;
				
			case 'B':
				System.out.println("Good");
				break;
				
			case 'C':
				System.out.println("Average");
				break;
				
			case 'D':
				System.out.println("Good");
				break;
				
			case 'F':
				System.out.println("Fail");
				break;
				default:
					System.out.println("Enter valid alphabet");
	}}
}
