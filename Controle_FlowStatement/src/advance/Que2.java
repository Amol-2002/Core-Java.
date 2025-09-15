//A company calculates bonus:
//If employee’s years of service > 10 → 10% of salary bonus
//If 6–10 years → 8% bonus
//If < 6 years → 5% bonus
package advance;
import java.util.Scanner;
public class Que2 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the how many year u service");
	int year=sc.nextInt();
	
	if(year>10) {
		System.out.println("10% of salary bonus");
	}
	else if(year>6 &year<10) {
		System.out.println("8% of salary bonus");
	}
	else if(year<6) {
		System.out.println("5% of salary bonys");
	}
}
}
