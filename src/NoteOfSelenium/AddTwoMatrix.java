package NoteOfSelenium;

import java.util.Arrays;

public class AddTwoMatrix {

	public static void main(String[] args) {
         
		int one[][] = { {1, 2}, {2, 3}, {3, 4}};
		int two[][] = { {4, 3}, {3, 2}, {2, 1}};
		
		
		int row = one.length;
		int column = one[0].length;
		
		
		int sum[][] = new int[row][column];
		
		
		for(int i = 0; i<row; i++) {
			for(int j = 0; j<column; j++) {
				sum[i][j] = one[i][j] - two[i][j];
			}
		}
		
		for(int i = 0; i<row; i++) {
			for(int j=0; j<column; j++) {
				System.out.print(sum[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
