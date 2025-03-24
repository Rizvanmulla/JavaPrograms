package Module3Arrays;
//WAP on Array of size 4 belong to int type and copy its value into another array in reverse order			
import java.util.Arrays;
public class reverseorderarray {
	public static void main(String[] args) {
		int rollno1[]=new int[3];
		rollno1[0]=10;
		rollno1[1]=21;
		rollno1[2]=18;
		
		int reversed[]=new int[3];
		for(int i=0,j=2;i<=2;i++,j--)
				{		
							reversed[j]=rollno1[i];
				}
		System.out.println("Original Array "+Arrays.toString(rollno1));
		System.out.print("Reversed array is ");
		System.out.print(Arrays.toString(reversed));
	
		}

	}


