package Module3Strings;

public class stringclass3 {
public static void main(String[] args) {
	String a="Rijwan";
		//to count the characters we use length
	
		System.out.println(a.length());
		//or
		/*int length=a.length();
		System.out.println(length);*/
		
		System.out.println(a);//original string
		
		String a1=a.toUpperCase();//here a1 is a new string as strings are immutable
		System.out.println(a1);//here the new string which is capitalized
		
		String a2=a.toLowerCase();//here a1 is a new string as strings are immutable
		System.out.println(a2);//here the new string which is capitalized
}
}
