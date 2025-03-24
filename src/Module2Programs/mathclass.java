package Module2Programs;

public class mathclass
{

	public static void main(String[] args)
	
	{
		System.out.println(Math.addExact(10,20));//4 methods
		System.out.println(Math.addExact(3001,45512));
		System.out.println(Math.multiplyExact(300,211));//4 methods
		System.out.println(Math.multiplyExact(32315,12));
		System.out.println(Math.subtractExact(32315,12));
		System.out.println(Math.subtractExact(32315,14542));
		System.out.println(Math.max(12, 10));//11 methods
		System.out.println(Math.max(12.25,12.26));
		System.out.println(Math.min(10, 22));//15 methods
		System.out.println(Math.abs(-124.25));//19 methods, returns positive value if entered negetive value
		System.out.println(Math.random());// always generates random values each time between 0 and 1
		
		double a=Math.random();//declaring a variable and assigning random value
		System.out.println(a);
		
		System.out.println(Math.PI); //calling directly pi value
		
		double pi=Math.PI;//decalring a variable and calling, whereever pi required declare a vairable
		// and use above math.pi class method
				
		System.out.println(pi);
	}
	
	
}
