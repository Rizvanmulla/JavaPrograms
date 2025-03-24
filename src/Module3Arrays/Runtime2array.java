                                                    package Module3Arrays;

import java.util.Arrays;
import java.util.Scanner;

//WAP to accept the values of 2 array at run time and compare if they are equals
public class Runtime2array {

	public static void main(String[] args) {
		int array1[] = new int[4];
		int array2[] = new int[4];
		
		Scanner s1=new Scanner(System.in);
		for (int i=0;i<array1.length;i++)
			{System.out.println("Enter the first array");
				array1[i]=s1.nextInt();
			}
		for (int i=0;i<array2.length;i++)
		{System.out.println("Enter the Second array");    
			array2[i]=s1.nextInt();
		}
		
		s1.close();
        System.out.println("The first array is: " + Arrays.toString(array1));
        System.out.println("The second array is: " + Arrays.toString(array2));
		
	boolean answer=Arrays.equals(array1, array2);
	if(answer==true)
	{System.out.println("they are equals");}
	else
	{System.out.println("they are not equals");}
	}

}
