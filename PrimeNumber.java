import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number to check if prime or not");
		int num = scanner.nextInt();
		for(int i = 2; i <= num/2; i++) {
			num = num % i;
			if(num == 0) {
				System.out.println("Not a prime number");
				break;
			}
			System.out.println("Its a Prime number");
		}
		
		scanner.close();
	}

}



