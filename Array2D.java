import java.util.Scanner;

public class Array2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the total number of Rows");
		int m = scanner.nextInt();
		System.out.println("Enter the total number of Columns");
		int n = scanner.nextInt();
		int arr[][];
		arr = new int[m][n];
		
		for(int i = 0; i < m; i++) {
			for(int j = 0;j < n; j++) {
				System.out.print("Enter element ");
                arr[i][j] = scanner.nextInt();
            }
			
		}
		System.out.println("Array are :");
		for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
		scanner.close();
	}

}
