package practice;

public class SIBIIBProgram {
	public SIBIIBProgram(int a)
	{
		System.out.println("Constructor");
	}
	static {
		System.out.println("SIB 1");
	}
	static {
		System.out.println("SIB 2");
	}
	static {
		System.out.println("SIB 3");
	}
	{
		System.out.println("IIB 1");
	}
	{
		System.out.println("IIB 2");
	}
	{
		System.out.println("IIB 3");
	}
		public static void main(String[] args) {
		
			System.out.println("Main Method");
			new SIBIIBProgram(10);
		//SIB get called automatically
	//	new SIBIIBProgram();//creating object for calling IIB
		
	}
}
