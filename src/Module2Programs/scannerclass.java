package Module2Programs;

import java.util.Scanner;

public class scannerclass {
	public static void main(String[] args)

	{

		Scanner s1 = new Scanner(System.in);
		byte a = s1.nextByte();
		short b = s1.nextShort();
		int c = s1.nextInt();
		long d = s1.nextLong();
		float e = s1.nextFloat();
		double f = s1.nextDouble();
		boolean answer = s1.nextBoolean();
		String name = s1.next();// for single letter string used no char
		s1.close();// to close the scanner
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(answer);
		System.out.println(name);
	}
}
