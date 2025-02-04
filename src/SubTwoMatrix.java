
public class SubTwoMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int first[][] = {{1, 2}, {5, 10}, {2, 6}};
		// 1st for loop 3 line 
		// 2nd for loop 2 element at each line
		
		int second[][] = {{ 2, 6}, {1, 2}, {5, 3}};
		
		// Allocating Memory for new 2d array
		
		int sub[][] = new int [3][2];
		
		
		
		// Subtracting Two matrix 
		
		for (int i=0; i<first.length; i++) {
			for (int j=0; j<first[0].length; j++) {
				 sub[i][j] = first[i][j] - second[i][j];
			}
		}
		
		
		// print new matrix 
		
		for (int i= 0; i< first.length; i++) {
			for (int j=0; j<first[0].length; j++) {
				System.out.print(sub[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
