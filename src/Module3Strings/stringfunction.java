package Module3Strings;

public class stringfunction {
public static void main(String[] args) {
	String a="Rijwan";
	System.out.println(a.charAt(4));
	System.out.println(a.charAt(3));
	System.out.println(a.indexOf('R')); 
	System.out.println(a.indexOf('n'));
	//or
	char a1=a.charAt(3);
	System.out.println(a1);
	
	String b="Kalandar Mulla";
	System.out.println(b.substring(9));
	System.out.println(b.substring(0,8));
	
	String m="              Rijwan                kalandar             Mulla              ";
	System.out.println(m);
	System.out.println(m.trim());//only deletes the space after starting and end of string, not in middle
	}
}
