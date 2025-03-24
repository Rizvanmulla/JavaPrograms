package Module1assignments;

public class AssignMethod {
	// calling static methods in main method
	static void add() {
		int a = 12;
		int b = 11;
		System.out.println(a + b);
	}

	static void mul() {
		double b = 12.22;
		double c = 11.33;
		System.out.println(b * c);
	}

	// calling non static methods in main methods

	void sum() {
		int a = 10;
		int b = 20;
		System.out.println(a + b);
	}

	void div() {
		int a = 10;
		int b = 20;
		System.out.println(b / a);
	}

	public static void main(String[] args) {
		System.out.println("static method overloading");
		add();
		mul();

		System.out.println("Non static method overloading");
		AssignMethod m = new AssignMethod();
		m.sum();
		m.div();
	}
}
