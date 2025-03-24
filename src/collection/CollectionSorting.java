package collection;
import java.util.ArrayList;
import java.util.Collections;
public class CollectionSorting {
	public static void main(String[] args) {
		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(55);
		a1.add(13);
		a1.add(43);
		a1.add(27);
		a1.add(25);
		a1.add(38);
		a1.add(30);
		a1.add(32);
		a1.add(10);
		System.out.println(a1);
		
		Collections.sort(a1);// Collections is a class which is used to sort a collection, came in 1.2,static
		System.out.println(a1);	// method sort so called using classname.methodname
		
		Collections.reverse(a1);
		System.out.println(a1);
		}
}
