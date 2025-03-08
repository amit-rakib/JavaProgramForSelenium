package NoteOfSelenium;

public class SubtractTwoMatrix {
	
	
	public static void main(String[] args) {
	
	int one[][] = { {1, 2}, { 2, 3}, {3, 4}};
	
	int two[][] = { { 5, 4}, {4, 3}, { 3, 2}};
	
	int row = one.length;
	
	int col = one[0].length;
	
	
	int sub[][] = new int[row][col];
	
	
	for(int i = 0; i<row; i++) {
		for( int j=0; j<col; j++) {
			sub[i][j] = one[i][j] - two[i][j];
		}
	}
	
	
	for(int i=0; i<row; i++) {
		for(int j=0; j<col; j++) {
			System.out.print(sub[i][j]+"\t");
		}
		
		System.out.println();
	}
	
	
	
	
	
	
	
	
	
	}
}
