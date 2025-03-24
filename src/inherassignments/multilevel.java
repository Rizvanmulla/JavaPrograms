package inherassignments;

// WAP to create relation between multiple classes containing both static and non-static methods.
// Multi Level Inheritance

class primaryclass {
	static void add() {
		System.out.println("First Static Method");
	}

	void sub() {
		System.out.println("First Non-Static Method");
	}
}

class second extends primaryclass {
	static void mul() {
		System.out.println("Second Static Method");
	}

	void div() {
		System.out.println("Second Non-Static Method");
	}

}

public class multilevel {
	public static void main(String[] args) {
		second a = new second();
		primaryclass.add();
		a.sub();
		second.mul();
		a.div();
	}
}
