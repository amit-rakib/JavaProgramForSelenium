
public class AddTwoMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int first[][] = { { 1, 2 }, { 5, 10 }, { 2, 6 } };
		int second[][] = { { 2, 6 }, { 1, 2 }, { 5, 3} };
		
		// Firstly we need to find out how many lines in first matrix 
		// for 1st for loop 3 lines 
		
		int m = first.length;
		
		// Secondly we need in each line how many values
		// for 2nd for loop 2 values
		int n = first[0].length;
		
		// Now we need to create memory for the new matrix 
		int sum[][] = new int[m][n];
		
		
		// Two for loop for i, j
		// for adding two matrix
		for (int i=0; i<m; i++) {
			for (int j=0; j<n; j++) {
				sum[i][j] = first[i][j] + second[i][j];
			}
		}
		
		// for printing two matrix
		// need two for loop i, j too
		
		for (int i=0; i<m; i++) {
			for (int j =0; j<n; j++) {
				System.out.print(sum[i][j] + "\t");
			}
			System.out.println();
		}
		
		

	}

}
