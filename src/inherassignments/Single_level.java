package inherassignments;

// WAP to create relation between 2 classes having static methods using the extends keyword.
// Single Level Inheritance.

class base {
	static void add() {
		System.out.println("The first static method");
	}
}

class Single_level extends base {
	static void sub() {
		System.out.println("The second static method");
	}

	public static void main(String[] args) {
		add();
		sub();
	}
}