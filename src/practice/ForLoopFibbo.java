package practice;

public class ForLoopFibbo {

	public static void main(String[] args) {
		int n = 10; // Number of Fibonacci numbers to print
		int num1 = 0, num2 = 1;

		System.out.println("First " + n + " Fibonacci numbers:");

		for (int i = 1; i <= n; ++i) {
			System.out.println(num1);
			// Update values for the next iteration
			int nextNum = num1 + num2;
			num1 = num2;
			num2 = nextNum;
		}
	}
}
