import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number to check the Fibonacci Series");
		int sum;
		int num = scanner.nextInt();
		int fo1 = 0;
		int fo2 = 1;
		System.out.print(fo1+" "+fo2);
		for (int i = 2; i <= num; i++) {
			sum =  fo1 + fo2;
			System.out.print(" " +sum);
			fo1 = fo2;
			fo2 = sum;
		}
		
		scanner.close();
	}

}
