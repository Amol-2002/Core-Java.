//Input a time (24-hr format) and display:
//"Good Morning" (5–12)
//"Good Afternoon" (12–17)
//"Good Evening" (17–21)
//"Good Night" (21–5)
package advance;
import java.util.Scanner;
public class Que3 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the Time");
		int time = sc.nextInt();
		
		if(time>5 & time<12) {
			System.out.println("Good Morning");
		}
		else if(time>12 & time<17) {
			System.out.println("Good Afternoon");
		}
		else if(time>17 & time<21) {
			System.out.println("Good Evening");
		}
		else if(time>21 & time<24) {
			System.out.println("Good Night");
		}
	}
}
