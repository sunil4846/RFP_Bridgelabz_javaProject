import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number to check even or odd");
		int num = scanner.nextInt();
		if(num % 2 == 0) {
			System.out.println("Number is Even");
		}
		else {
			System.out.println("Number is odd");
		}
		
		scanner.close();
	}

}
