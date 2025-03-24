package Module2Programs;

import java.util.Scanner;

public class assignment24switchcase {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Imput 1 to know my Name");
		System.out.println("Imput 2 to know my number");
		System.out.println("Imput 3 to know my email");
		System.out.println("Imput 4 to know my gender");
		System.out.println("Imput 5 to know my Age");
		System.out.println("Imput 6 to know my Address");
		System.out.println("Enter the Value between 1 to 6");

		int input = s1.nextInt();

		switch (input) {
		case 1:
			System.out.println("Name is Rijwan");
			break;
		case 2:
			System.out.println("Number is 9975892798");
			break;
		case 3:
			System.out.println("emial id is rizvanmulla@gmail.com");
			break;
		case 4:
			System.out.println("gender is Male");
			break;
		case 5:
			System.out.println("Age is 37");
			break;
		case 6:
			System.out.println("Addrress is 402, Metroz Zaheer Plaze, solapur");
			break;
		default:
			System.out.println("Input is wrong");
			s1.close();
		}
	}

}
