package collection;

import java.util.ArrayList;
import java.util.Collection;

public class collprop3 {
	public static void main(String[] args) {
		Collection<String> c1 = new ArrayList<String>();
		c1.add("Kalandar");
		c1.add("Mariyam");
		c1.add("Rijwan");
		c1.add("Amzad");
		System.out.println(c1);

		Collection<String> c2 = new ArrayList<String>();
		c2.add("Rijwan");
		c2.add("Najnin");
		c2.add("Aafia");
		c2.add("Ozair");
		System.out.println(c2);

		c1.addAll(c2);
		System.out.println(c1);

		c2.remove("Rijwan");
		System.out.println(c2);

		c2.removeAll(c1);
		System.out.println(c2);
	}
}
