//Create a simple calculator that takes two numbers and an operator (+, -, *, /) and performs the operation using switch-case.
package switchCase;
import java.util.Scanner;
public class Que2 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter first number");
	double a = sc.nextDouble();
	
	System.out.println("Enter second number");
	double b = sc.nextDouble();
	
	System.out.println("Enter any operator (+,-,*,/)");
	char op = sc.next().charAt(0);
	
	switch(op) {
	case '+':
		System.out.println("Result : "+(a+b));
		break;
		
	case '-':
		System.out.println("Result : "+(a-b));
		break;
		
	case '*':
		System.out.println("Resutl : "+(a*b));
		break;
		
	case '/':
		if(b!=0)
			System.out.println("Result : "+(a/b));
		else System.out.println("Cannot divide by zero!1");
		break;
		
		default:System.out.println("invalid operator");
	}
}
}
