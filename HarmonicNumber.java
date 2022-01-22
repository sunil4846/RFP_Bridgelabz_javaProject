
public class HarmonicNumber {

	public static void main(String[] args) {
		int num = 10;
		float harmonic = 1;
		for(int i=1; i<=num; i++) {
			System.out.print("1/"+i + "+" );
			harmonic += (float)1/i;
//			System.out.print("");
			
			
		}
		System.out.println(harmonic);
	}

}
