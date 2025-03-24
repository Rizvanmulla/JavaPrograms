package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class collprop4 {
	public static void main(String[] args) {
		Collection<Character> c1 = new ArrayList<Character>();
		boolean b1=c1.isEmpty();
		System.out.println(b1);
		c1.add('R');
		c1.add('i');
		c1.add('j');
		c1.add('w');
		c1.add('a');
		c1.add('n');
		System.out.println(c1);

		Collection<Character> c2 = new ArrayList<Character>();
		boolean b2=c2.isEmpty();
		System.out.println(b2);
		c2.add('M');
		c2.add('u');
		c2.add('l');
		c2.add('l');
		c2.add('a');
		System.out.println(c2);
		boolean b3=c2.equals(c1);
		System.out.println(b3);//its giving false as both collections are not equal
		
		boolean b4=c2.contains('Y');//here it will check for Y is present in collection c2 or not
		System.out.println(b4);
		
		boolean b5=c2.containsAll(c1);//here it will check for c2 has all values of c1 or not
		System.out.println(b5);
		
		
		Iterator<Character> i1=c2.iterator();
		  while (i1.hasNext()) {
	            System.out.println(i1.next() + " "); // Prints each character
	        }
	}

}
