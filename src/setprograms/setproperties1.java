package setprograms;

import java.util.HashSet;
import java.util.Set;

public class setproperties1 {

	public static void main(String[] args) {
		Set<Integer> s1=new HashSet<Integer>();
		s1.add(45);
		s1.add(23);
		s1.add(77);
		s1.add(85);
		s1.add(21);
		s1.add(15);
		s1.add(45);//it will not store duplicate values, unique values only be stored
		System.out.println(s1);//this will not follow indexing, output is not as per indexing
	}

}
