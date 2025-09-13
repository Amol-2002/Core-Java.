package ifelse;
import java.util.Scanner;
//Input a character and check whether it is a vowel or consonant.
public class Que5 {
public static void main(String[] args) {
	Scanner sc= new Scanner (System.in);
	
System.out.println("enter any alphabet");
char alpha = sc.next().charAt(0);

 if (alpha == 'a' || alpha == 'e' || alpha == 'i' || alpha == 'o' || alpha == 'u' ||
alpha == 'A' || alpha == 'E' || alpha == 'I' || alpha == 'O' || alpha == 'U') {
	System.out.println("are vowels");

}
else {
	System.out.println("are consonant");
}
}
}
