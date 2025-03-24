package superthisassign;

public class Thisassignment {

	Thisassignment() {
		this(10);
		System.out.println("The output of first constructor");
	}

	Thisassignment(int a) {
		this('R');
		System.out.println("The output of Second parameterized constructor");
	}

	Thisassignment(char b) {
		System.out.println("The output of third parameterized constructor");
	}

	public static void main(String[] args) {
		new Thisassignment();

	}
}