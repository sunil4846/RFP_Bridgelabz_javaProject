import java.util.Scanner;

public class Quadratic {
static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Quadratic obj = new Quadratic();
		obj.quadratic();
		scanner.close();
	}
	
	public void quadratic() {
		System.out.println("Enter the first value");
		double a = scanner.nextDouble();
		System.out.println("Enter the second value");
		double b = scanner.nextDouble();
		System.out.println("Enter the third value");
		double c = scanner.nextDouble();
		// delta value
		double delta = (b*b)-(4*a*c);
		double deltaValue = Math.sqrt(delta);
//		System.out.println(""+deltaValue);
		double root1OfX = (-b + deltaValue)/(2*a);
//		System.out.println(root1OfX);
		double root2OfX = (-b - deltaValue)/(2*a);
//		System.out.println(root2OfX);
		double quadratic = ((a*root1OfX*root2OfX)+(b*root1OfX)+c);
		System.out.println("Quadratic value = "+quadratic);
	}

}
