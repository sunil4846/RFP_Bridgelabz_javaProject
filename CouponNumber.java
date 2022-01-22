import java.util.Scanner;

public class CouponNumber {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		CouponNumber couponNumber = new CouponNumber();
		int val = couponNumber.generateRandom();
		System.out.println("Generating Coupon Number");
		System.out.println("Enter number how many coupon to print");
		int numOfCoupon = scanner.nextInt();
		
		for(int i = 0; i <= numOfCoupon; i++) {
			if(val == val) {
				int val1 = couponNumber.generateRandom();
				System.out.println("Coupon Number = "+val);
				System.out.println("Coupon Number = "+val1);
				val += 1;
			}			
		} 				
		scanner.close();
	}
	
	public int generateRandom() {
		int randomValue = (int)(Math.random()*10000);
		return randomValue;
	}
}
