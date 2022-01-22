import java.util.Scanner;

public class PowerOf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number to check power of 2^n ");
		int num = scanner.nextInt();
		int pow = 0;
		for (int i=1; i<=num; i++) {
			pow = (int) Math.pow(2, i);
		}
		System.out.println("Power of 2^"+num+ " = "+pow);
		scanner.close();
	}

}
