package collection;

import java.util.ArrayList;
import java.util.Collection;

public class Collproperty2 {
	public static void main(String[] args) {
		Collection<Integer> c1 = new ArrayList<Integer>();// to minimize this yellow warning we use wrapper class
		// now after giving Integer class we can only add homogeneous data of integer type
		//we can write String in Integer, and then we can add only string values as literals
		c1.add(22);
		c1.add(23);
		c1.add(24);
		c1.add(25);
		c1.add(26);
		c1.add(27);
		c1.add(28);
		c1.add(29);
		System.out.println(c1);
		
		Collection<String> c2 = new ArrayList<String>();
		c2.add("Rijwan");
		c2.add("Najnin");
		c2.add("Aafia");
		c2.add("Ozair");
		System.out.println(c2);
		
		c1.remove(22);
		System.out.println(c1);

		//c2.addAll(c1); here it not worked as both wrapper classes are different, one is integer and other is string
		//this will be done in map interface
		//we can do this by array but its of fixed size, but this has any number of values
		//hence collection accepts dynamic values(multiple values/any number of values/as per requirement/user not sure about size)
	}
}
