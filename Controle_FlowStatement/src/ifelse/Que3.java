package ifelse;
//Find the largest of two numbers.
import java.util.Scanner;
public class Que3 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the first number");
	int num1 = sc.nextInt();
	
	System.out.println("Enter the second number");
	int num2 = sc.nextInt();
	
if(num1>num2) {
	System.out.println(num1+ " is larger than" +num2);
	
}
else if(num2>num1) {
	System.out.println(num2+ "is larger than" +num1);
	
}
else {
	System.out.println("Both number are equal");
}
}
}
