//ATM program:
//If balance ≥ withdrawal amount → deduct and show balance
//Else → show "Insufficient Balance"
package advance;
import java.util.Scanner;
public class Que4 {
public static void main(String[] args) {
	double Total;
	Scanner sc = new Scanner (System.in);
	
	System.out.println("Enter balance");
	double Balance=sc.nextDouble();
	
	System.out.println("Enter withdrawal amount");
	double Withdrawal = sc.nextDouble();
	
	if(Balance>Withdrawal) {
		Total=Balance-Withdrawal;
		System.out.println("Whidrwal amount : "+Withdrawal+ ".INR");
		System.out.println("Total Balance :"+Total+ ".INR");
	}
	else {
		System.out.println("Insufficient Balance");
	}
}
}
