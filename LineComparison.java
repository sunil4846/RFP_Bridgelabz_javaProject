
public class LineComparison {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("UseCase1 calculate length");
		int x1 = 10;
		int x2 = 30;
		int y1 = 10;
		int y2 = 20;
		//UseCase1 to find length of line 		
		double lengthOfLine;
		double x = Math.pow((x2-x1), 2);
        double y = Math.pow((y2-y1), 2);
        lengthOfLine = Math.sqrt(x+y);
        System.out.println("Length of line = "+lengthOfLine);
        
        //usecase2 to check equality of two points
        if(x == y) {
        	System.out.println("Two length are equal");
        }        
        else {
        	System.out.println("Two length are not eqal");
        }
        
        //usecase3 to compare two line equal to or greaterthan or less than
        
        if(x == y) {
        	System.out.println("Two line are equal");
        }
        else if(x < y){
        	System.out.println("line X is less than line Y");
        }
        else {
        	System.out.println("line X is greater than line Y");
        }
        
	}

}
