package intermediate;
//A shop gives a discount:
//If bill > 5000 → 20% discount
//Else if bill > 2000 → 10% discount
//Else → No discount
//(Calculate final price).
import java.util.Scanner;
public class Que3 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the bill amount");
	double bill = sc.nextDouble();
	
	double Total;
	
	if(bill>=5000) {
		Total=bill-(bill*0.20);
		System.out.println("you will get 20% discount");
	System.out.println(Total+"this is your total bill");
	}
	else if(bill>2000){
		
		Total=bill-(bill*0.10);	
		System.out.println("your will get 10% discount");
		System.out.println(Total+"this is your total bill");
	}
	
	else {
	System.out.println("No discount");
	}
	}
}
