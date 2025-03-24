package practice;

interface Animal {
	void makeSound(); // Abstract method
	// Since Java 8, interfaces can have default methods

	default void eat() {
		System.out.println("This animal eats food.");
	}
}

class Dog implements Animal {
	public void makeSound() {
		System.out.println("The dog barks.");
	}

	public static void main(String[] args) {
		Dog d1 = new Dog();
		d1.makeSound();
		d1.eat();
	}
}
