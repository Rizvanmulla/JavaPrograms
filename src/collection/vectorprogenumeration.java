package collection;

import java.util.Comparator;
import java.util.Enumeration;
import java.util.Vector;

public class vectorprogenumeration {

	public static void main(String[] args) {

		Vector v1 = new Vector();
		v1.addElement(45);
		v1.addElement(89);
		v1.addElement(26);
		v1.addElement(56);
		v1.addElement(90);
		v1.addElement("Rijwan");
		v1.addElement(29);
		v1.addElement(null);
		v1.addElement(null);
		System.err.println(v1);// the properties are same as list
		// enumeration: its not like iterator
		System.out.println("After Enumeration the output will be");
		Enumeration e1 = v1.elements();
		while (e1.hasMoreElements())// return type of has more will be boolean
		{
			System.out.println(e1.nextElement());// return type of has more will be object
		}
		// some methods of vector are as follows
		System.out.println("The First Element is " + v1.firstElement());
		System.out.println("The Last Element is " + v1.lastElement());
		v1.removeElement(45);
		System.out.println("After Removing the Element 45 vector is " + v1);
	}
}
