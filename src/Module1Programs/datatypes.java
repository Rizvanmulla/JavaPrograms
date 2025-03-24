package Module1Programs;

public class datatypes {
public static void main(String[] args) 

{
	
	int a; //declaration
	a=100;//initilization
	System.out.println(a);

	
	byte k=10; //this line called as declaration and initilization and byte can store value upto -128 to 127
	
	System.out.println(k);//this is utilization, we have utilized the values declared and initilized above
	
	short b=654;
	System.out.println(b);
	
	int c=9000;
	System.out.println(c);
	
	long d=1029322342423242342l; //if bigger value and you have to put suffix l after the digit
	System.out.println(d);
	
	float d1=85.21f; //can only 2 or 3 decimal values and need to give suffix as f
	System.out.println(d1);
	
	double d2=9.1234567; //can store 17 to 19 decimal values
	System.out.println(d2);
	
	char gender='M'; /* alphabets can be stored under single quote else it will give compile time error, 
	if i want to write male as gender then i should use datatype as string,, but string will use double inverted comma and char
	will save single alphabet with single inverted comma*/
	System.out.println(gender);
	
	boolean answer=true; //it can only give output as true or false
	System.out.println(answer);
	
	String name="Rijwan"; //String can start with only start with capital as its 
	System.out.println(name);
	
}

}
