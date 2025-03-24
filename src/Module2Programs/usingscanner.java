package Module2Programs;

import java.util.Scanner;

public class usingscanner 
{
public static void main(String[] args) 
{
	Scanner s1=new Scanner(System.in);
	System.out.println("Enter the Value of a");
	int a=s1.nextInt();
	System.out.println("Enter the Value of b");
	int b=s1.nextInt();
	int sum=a+b;
	System.out.println("The Sum of the two numbers is "+sum);
	s1.close();//to close the scanner
}
}
