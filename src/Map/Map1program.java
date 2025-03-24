package Map;

import java.util.HashMap;
import java.util.Map;

public class Map1program {

	public static void main(String[] args) {
		// we use Map interface when we use to store data in pairs
		//lets create an object by upcasting and lets store two values in Key and Values
		Map m1= new HashMap();//upcasting
		m1.put("Rijwan",'M');
		m1.put("Najnin",'F');
		m1.put("Aafia",'F');
		m1.put("Ozair",'M');
		System.out.println(m1);
		
		Map<Integer,String> m2=new HashMap<Integer,String>();//account with name
		m2.put(2798, "Rijwan");
		m2.put(1333, "Najnin");
		m2.put(2292, "Aafia");
		m2.put(2665, "Ozair");
		m2.put(2665, "Ozair");//does not allow duplicate values
		System.out.println(m2);
		
		Map<Integer,String> m3=new HashMap<Integer,String>();//account with name
		m3.putAll(m2);
		System.out.println(m3);
		
	//	m3.clear();
	//	System.out.println(m3);//will make empty the map
		
		System.out.println(m3.isEmpty());
		
		m2.remove(2798);//we can use only key as well as key and values
		System.out.println(m2);
		
		m2.putIfAbsent(2798, "Rijwan");//putting again if absent
		System.out.println(m2);
		
		m2.replace(2665, "Uzair");
		System.out.println(m2);//replace will replace the value of given key, here 2665 is key and Uzair is value
		
		m2.replace(2665, "Uzair", "Ozair");
		System.out.println(m2);
	}
}
