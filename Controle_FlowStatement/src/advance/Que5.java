//Traffic light simulation:
//If input is "red" → Stop
//If "yellow" → Get ready
//If "green" → Go
package advance;
import java.util.Scanner;
public class Que5 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("inter any color (Red-Yellow-Green)");
		String color=sc.next();
		
		  if (color.equalsIgnoreCase("Yellow")) {
	            System.out.println("Get Ready");
	        } else if (color.equalsIgnoreCase("Red")) {
	            System.out.println("Stop");
	        } else if (color.equalsIgnoreCase("Green")) {
	            System.out.println("Go");
	        } else {
	            System.out.println("Choose a valid option (Red / Yellow / Green)");
	        }	
		  }
}
