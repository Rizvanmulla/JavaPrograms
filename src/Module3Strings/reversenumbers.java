package Module3Strings;

public class reversenumbers {
public static void main(String[] args) {
	//reverese a string
	String name="9876543210";
	System.out.println(name);
	//System.out.println(name.length());
	String reversed="";
	for(int i=name.length()-1;i>=0;i--)
	{
		char c=name.charAt(i);
		reversed=reversed+c;
	}
	System.out.println("The output after reversing is: "+reversed);
}
}
