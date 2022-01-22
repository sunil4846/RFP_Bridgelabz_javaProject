import java.util.Scanner;

public class Distance {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Distance obj = new Distance();
		obj.distance();
		scanner.close();
	}
	
	public void distance() {
		System.out.println("Enter the first coordinate");
		double x = scanner.nextDouble();
		System.out.println("Enter the second coordinate");
		double y = scanner.nextDouble();
		double x1 = x*x;
		double y1 = y*y;
		double distance = Math.sqrt(x1+y1);
		System.out.println("Distance = "+distance);
	}

}
