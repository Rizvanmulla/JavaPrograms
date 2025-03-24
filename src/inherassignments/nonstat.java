package inherassignments;
//WAP to create relation between 2 classes having non-static methods using extends keyword. 

//Single Level Inheritance.

class first {
	void add() {
		System.out.println("First non static method");
	}
}

public class nonstat extends first {
	void sub() {
		System.out.println("Second non static method");
	}

	public static void main(String[] args) {
		nonstat a = new nonstat();
		a.add();
		a.sub();
	}
}
