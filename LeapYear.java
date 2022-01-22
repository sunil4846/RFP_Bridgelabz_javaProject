import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the year to check Leap year or not");
		int year = scanner.nextInt();
		if((year % 4 == 0) && (year % 100 != 0)) {
			System.out.println("Its a Leap year");
		}
		else if(year % 400 == 0) {
			System.out.println("Its a Leap year");
		} 
		else {
			System.out.println("Its not a Leap year");
		}
		scanner.close();
	}

}
