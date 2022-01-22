import java.util.Scanner;

public class SwapNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first number to swap");
		int a = scanner.nextInt();
		System.out.println("Enter the second number to swap");
		int b = scanner.nextInt();
		
		//swapping number 	
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("After swapping first value = "+a);
		System.out.println("After swapping second value = "+b);
		
		scanner.close();
	}

}
