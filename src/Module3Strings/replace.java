package Module3Strings;

public class replace {

	public static void main(String[] args) {
		String s1="Rijwan Mulla";
		System.out.println(s1);
		System.out.println(s1.replace('j', 'z'));
		
		String s2="Ozair Mulla";
		System.out.println(s2);
		System.out.println(s2.replace("Ozair", "Uzair"));
		
		String s3="Aafia Mulla";
		System.out.println(s3);
		System.out.println(s3.replaceAll("[a-z]",""));
		
		String s4="9975892798 Rijwan Mobile";
		System.out.println(s4);
		System.out.println(s4.replaceAll("[9]","7"));	
	}

}
