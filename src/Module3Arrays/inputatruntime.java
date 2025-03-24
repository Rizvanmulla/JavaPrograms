package Module3Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class inputatruntime {

	public static void main(String[] args) {
	System.out.println("enter the size of array");
	Scanner s1=new Scanner(System.in);
	int rollno[]=new int[s1.nextInt()];
	
		for(int i=0;i<=rollno.length-1;i++)
	{
			System.out.println("Enter the Value of array at the index "+i);
			rollno[i]=s1.nextInt();
			}
		System.out.println(Arrays.toString(rollno));
		s1.close();
	}

}
