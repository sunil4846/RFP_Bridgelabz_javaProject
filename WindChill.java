import java.util.Scanner;

public class WindChill {

	static Scanner scanner = new Scanner(System.in); 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WindChill obj = new WindChill();
		obj.windChill();
		scanner.close();
	}
	
	public void windChill() {
		System.out.println("Enter the value in fahrenite");
		double t = scanner.nextDouble();
		System.out.println("Enter the value of wind speed");
		double v = scanner.nextDouble();
		
		double w = 35.74 + (0.6215*t) + (((0.4275*t) - 35.75)*(Math.pow(v, 0.16)));
		System.out.println("Wind chill = "+w);
	}

}
