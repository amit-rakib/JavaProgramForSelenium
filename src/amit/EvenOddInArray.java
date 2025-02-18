package amit;

public class EvenOddInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int array [ ] = { 1, 2, 3, 4, 5, 6};
		
		
		for(int i : array) {
			if(i%2 == 0) {
				System.out.println("Even");
			} else {
				System.out.println("Odd");
			}
		}

	}

}
