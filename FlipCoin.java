
public class FlipCoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FlipCoin obj = new FlipCoin();
		obj.flipCoin();
	}
	public void flipCoin() {
		int flip = (int)(Math.random()*10)%2;
		int i = 1;
		int headPer = 0;
		int tailPer = 0;
		while(i<=5) {
			switch (flip) {
			case 0:
				headPer = i + 1;
//				System.out.println(headPer);
				System.out.println("Its head");
				break;
			case 1 :
				tailPer = i + 1;
				System.out.println("Its tails");
				break;
			default:
				System.out.println("Something wrong");
				break;
			}
			
			i = i+1;
			
		}
		int headPercentage = (headPer*100)/i;
		System.out.println("Head percentage = "+ headPercentage);
		int tailPercentage = (tailPer*100)/i;
		System.out.println("Tails percentage = " + tailPercentage);
	}
}
