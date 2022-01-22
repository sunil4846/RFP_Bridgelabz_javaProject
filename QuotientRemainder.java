import java.util.Scanner;

public class QuotientRemainder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first number");
		double num1 = scanner.nextInt();
		System.out.println("Enter the second number");
		double num2 = scanner.nextInt();
		
		//finding quotient		
		double quotient;
		quotient = num1/num2;
		System.out.println("Quotient = "+quotient);
		
		//finding Remainder		
		double remainder;
		remainder = num1 % num2;
		System.out.println("Remainder = "+remainder);
		scanner.close();
	}

}
