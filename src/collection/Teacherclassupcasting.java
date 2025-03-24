package collection;

public class Teacherclassupcasting {
//system.out.println("Teacher class property");
}

class Studentclass extends Teacherclassupcasting {
	public static void main(String[] args) {
		//Studentclass s1 = new Studentclass();
		// access methods of child and parent
		// Upcasting
		// converting the child class object into superclass type
		Teacherclassupcasting t1=new Studentclass();
		// by this we can only access the parentclass property in child class
	}
}