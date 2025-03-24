package ListProperties;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class listpropertyiter2 {
	public static void main(String[] args) {
		List<Integer> li = new ArrayList<Integer>();
		li.add(9);
		li.add(103);
		li.add(130);
		li.add(14);
		li.add(150);
		System.out.println("The Given List is " + li);
		Collections.sort(li);
		System.out.println("List after Sorting is " + li);
		
		// not possible with Iterator, use List of Iterator
		// methods of list of iterators are
		// hasnext, hasprevious, next, previous, remove, set
		
		System.out.println("Forward Iteration using List of Iterator");
		ListIterator<Integer> i2 = li.listIterator();
		while (i2.hasNext()) {
			System.out.println(i2.next());
		}
		
		System.out.println("Backward Iteration using List of Iterator");
		while (i2.hasPrevious()) {
			System.out.println(i2.previous());
		}
	}
}
