package StringProblems;
import java.util.Scanner;
public class ReversingaString {

	public static void main(String[] args) {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter your String");
		String word=s1.nextLine();
		String reversed="";
		for(int i=word.length()-1;i>=0;i--)
		{
			char c=word.charAt(i);
			reversed=reversed+c;
		}
		
		System.out.println("Reversed String is "+reversed);
		s1.close();
	}
}
