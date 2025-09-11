package starpattern;

public class Pyramid {
public static void main(String []args) {
	int n = 5;
	 for (int i = 1; i<=n; i++) {
		 
		 for(int j = i; j<n; j++) {
		 System.out.print(" ");
	 }
	 for(int k = i; k<= (2*i-1);k++) {
		 System.out.print("*");
	 }
	 System.out.println();
}
}
}
