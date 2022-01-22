import java.lang.Math;
public class SnakeLadder {

	public static void main(String[] args) {
		
		int totalDiceRolled = 0;
		int position = 0;
		int currentPosition = 0;
		int finalPosition = 100;
		while(currentPosition <= finalPosition ) {	
			int rollsDie = (int)((Math.random()*10)%6+1);
			System.out.println("Dice value = "+rollsDie);
			int option = (int)((Math.random()*10)%3);
			switch (option) {
			case 0:
				System.out.println("Player not playing and is at position = "+currentPosition);
				break;
			case 1:
				position = currentPosition+rollsDie;
				if(position > 100) {
					position = currentPosition;
				}
				System.out.println("player got ladder and is at position = "+position);
//				rollsDie += 1; 
				break;
			default:
				position = currentPosition - rollsDie;
				if(position == 0) {
					position = 0;
				}
				System.out.println("player got snake and is at position = "+position);
			if(position == 100) {
				System.out.println("Player won");
			}else 
				break;
			currentPosition = position;
			
			}
			currentPosition++;
			totalDiceRolled += rollsDie;
			
		}
		
		System.out.println("The number of dice rolled = "+totalDiceRolled);
		
	}

}
