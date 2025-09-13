package ifelse;
import java.util.Scanner;
//Write a program to check if a number is positive, negative, or zero.
public class Que4 {
public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	
	System.out.println("Enter any number");
	int num =sc.nextInt();
	
	if(num>0) {
		System.out.println("it is positive number");
	}
	
	else if(num<0) {
		System.out.println("it is a negative number");
	}
	else {
		System.out.println("it is zero");
	}
}
}
