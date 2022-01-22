import java.util.Scanner;

public class PrimeFactors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number to check the Prime Factorization");
		int num = scanner.nextInt();
		int prime;
		for(int i=2; i*i<=num; i++) {
			prime = num/i;
			System.out.println(prime);
		}
		
		scanner.close();
	}

}
