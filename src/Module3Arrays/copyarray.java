package Module3Arrays;
//WAP on Array of size 4 belong to int type and copy its value into another array
import java.util.Arrays;
import java.util.Scanner;
public class copyarray {
	public static void main(String[] args) {
		System.out.println("enter the size of array");
		Scanner s1=new Scanner(System.in);
		int rollno[]=new int[s1.nextInt()];
		for(int i=0;i<=rollno.length-1;i++)
		{		System.out.println("Enter the Value of array at the index "+i);
				rollno[i]=s1.nextInt();
				}
		System.out.println(Arrays.toString(rollno));
			
			int[] rollno1=new int[rollno.length]; //new string and copies length from first string
			rollno1=rollno;
			for (int j=0;j<=rollno1.length-1;j++)
			{
				rollno1[j]=rollno[j];
			}
			System.out.println("Copied array is ");
			System.out.println(Arrays.toString(rollno1));
			s1.close();
		}

	}


