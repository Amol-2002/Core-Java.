//A student gets grades based on marks:
//90–100 → A
//75–89 → B
//50–74 → C
//Below 50 → Fail
//(Print the grade).

package advance;
import java.util.Scanner;
public class Que1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your percentage");
		
		int num=sc.nextInt();
		
		if(num>=90 & num<=100) {
			System.out.println("Grade A");
		}
		else if(num>=75 & num<=89) {
			System.out.println("Grade B");
		}
		else if(num>=50 & num<=74) {
			System.out.println("Grade C");
		}
		else {
			System.out.println("Fail");
		}
	}
}
