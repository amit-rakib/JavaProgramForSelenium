
public class SingleDimArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int array[] = { 200, 300, 400, 500, 600};
		
		for (int i : array) {
			System.out.println(i);
		}
		
		// break the for loop in the middle
		
		for( int i : array) {
			if (i == 400) {
				break;
			}
			System.out.println(i);

		}

	}

}
