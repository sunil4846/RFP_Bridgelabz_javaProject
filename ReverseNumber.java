import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scanner.nextInt();
		int remainder;
		int reverse = 0;
		for(int i = 0; i < num; i++) {
			
			remainder = num % 10;
			reverse = (reverse * 10) + remainder;
			num = num/10;
			
		}
		System.out.println("Reverse number = "+reverse);
		int i = 0;
		while(i < num) {
			remainder = num % 10;
			reverse = (reverse * 10) + remainder;
			num = num/10;
			i += 1;
		}
		System.out.println("Reverse number = "+reverse);
	}

}
