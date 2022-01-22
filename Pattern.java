import java.util.Scanner;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scanner.nextInt();
		for(int i=0; i<num; i++) {
			int j = 0;
			while(j<=i) {
				System.out.print("*");
				j +=1;
			}
			
			System.out.println();
		}
		scanner.close();
	}

}
