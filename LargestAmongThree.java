import java.util.Scanner;

public class LargestAmongThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Problem to find Largest amoung three number");
		System.out.println("Enter X value");
		int x = scanner.nextInt();
		System.out.println("Enter Y value");
		int y = scanner.nextInt();
		System.out.println("Enter Z value");
		int z = scanner.nextInt();
		if(x > y && x > z) {
			System.out.println("X is greater");
		}
		else if(y > x && y > z) {
			System.out.println("Y is greater");
		}
		else {
			System.out.println("Z is greater");
		}
		scanner.close();
	}

}
