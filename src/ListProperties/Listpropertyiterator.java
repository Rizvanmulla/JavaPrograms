package ListProperties;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Listpropertyiterator {
	public static void main(String[] args) {
		List li = new ArrayList();// here upcasting is done, to find out properties of list we converted child
									// class object into super class
		li.add("Rijwan");
		li.add("37");
		li.add("5.4");
		li.add('M');
		li.add("Program");
		li.add(true);
		li.add(null);
		System.out.println(li);//we can't sort it as these are heterogeneous values
		
		Iterator i1=li.iterator();
		//hasnext method: whenever it start with has? return type will be boolean as its a que
		//in this it will help us to identify the next element present or not
		while(i1.hasNext())//if has next will true the while loop will run
		{
			System.out.println(i1.next());// i had written hasnext in here and was running infinitely, use next only
		}
		//using this we can do forward iteration only
		//next- object return type
		//remove
		}
}