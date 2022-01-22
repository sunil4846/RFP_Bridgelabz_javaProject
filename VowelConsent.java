import java.util.Scanner;

public class VowelConsent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter character to check vowels or consonant");
		char value = scanner.next().charAt(0);
		if( value == 'a' || value == 'e' || value == 'i' || value == 'o' || value == 'u') {
			System.out.println("character entered is vowels");
		}
		else {
			System.out.println("character entered is consonant");
		}
		
		scanner.close();
	}

}
