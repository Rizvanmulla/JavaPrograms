package collection;

import java.util.ArrayList;
import java.util.Collection;

public class collectionproperty {

	public static void main(String[] args) {
		Collection c1 = new ArrayList();//arraylist is predefined class and we created an object to use its properties
		c1.add("Rijwan");
		c1.add("Male");
		c1.add("37");
		c1.add("Rijwan");
		c1.add(null);
		c1.add("80000");
		c1.add("rizvanmulla@gmail.com");
		c1.add("True");
		System.out.println(c1);
		/*collection follow indexing
		 * follow order of insertion means indexing
		 * duplicate values can be stored
		 * null-accepts null, every class properties are different
		 * it accepts heterogeneous values, means data of different type as literals
		 * */
	}

}
