package superthisassign;

// Parent class Animal
class Animal {
    // Constructor without parameters
    Animal() {
        System.out.println("An animal is created");
    }

    // Constructor with a parameter
    Animal(String name) {
        System.out.println("An animal named " + name + " is created");
    }
}

// Child class Dog, which extends Animal
class Dog extends Animal {

    // Default constructor (calls Animal's default constructor using super())
    Dog() {
        super(); // Calls the no-argument constructor of Animal, here we can call it explicitly
        System.out.println("A dog is created");
    }

    // Parameterized constructor (calls Animal's parameterized constructor using super(name))
    Dog(String name) {
        super(name); // Calls the constructor of Animal with a name
        System.out.println("A dog named " + name + " is created");
    }
}
class Lion extends Animal {

    // Default constructor (calls Animal's default constructor using super())
    Lion() {
        super(); // Calls the no-argument constructor of Animal, here we can call it explicitly
        System.out.println("A Lion is created");
    }

    // Parameterized constructor (calls Animal's parameterized constructor using super(name))
    Lion(String name) {
        super(name); // Calls the constructor of Animal with a name
        System.out.println("A Lion named " + name + " is created");
    }
}
// Main class with the main method
public class SuperCalling {
    public static void main(String[] args) {
        // Creating a Dog object using the default constructor
        Dog d1 = new Dog(); 
        // Creating a Dog object using the parameterized constructor
        Dog d2 = new Dog("Rocky"); 
        
        Lion l1=new Lion();
        Lion l2=new Lion("Mufasa");
        
    }
}
