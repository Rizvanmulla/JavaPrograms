package Module3Strings;
//mutable and immutable
//mutable means something that can be changed
//immutable means something that can't be changed
public class stringclass2mutableimmutable 
{
public static void main(String[] args)
{
				String a="Automation";//created a string
				System.out.println(a);
				System.out.println(a.concat(" Testing"));//created a new string
				
	//strings are immutable in nature
	
	StringBuilder s1=new StringBuilder("second");//string builder is used to mutate the strings
				System.out.println(s1.append(" Testing"));
				System.out.println(s1.append(" third Testing"));
				System.out.println(s1);
	//this was mutable
	
	StringBuffer s2=new StringBuffer("Manual");//string builder is used to mutate the strings
				 s2.append(" Testing");
				 s2.append(" Course");
				 s2.append(" by MKT");
				 System.out.println(s2);
	
}
}
