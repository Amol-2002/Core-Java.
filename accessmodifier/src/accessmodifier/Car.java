package accessmodifier;

public class Car {

	public int carId;
	private String carName;
	protected int carModel;
	int price;

	Car() {
		System.out.println("this is default const");
	}

	private Car(int a) {
		System.out.println("this is private constructor ");
	}

	protected Car(int a, int b) {
		System.out.println("this. is protected constructor");
	}

	public void m1() {
		System.out.println("public method m1");
	}

	private void m2() {
		System.out.println("private method m2");

	}

	protected void m3() {
		System.out.println("protected method m3");
	}

	void m4() {
		System.out.println("defualt method m4");
	}

	public static void main(String[] args) {
		Car c = new Car();
		c.m1();
		c.m2(); 
		c.m3();
		c.m4();
	}
}
