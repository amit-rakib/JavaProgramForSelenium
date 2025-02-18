package amit;

public class SecondLargestElement {
	
	public static void main(String[] args) {
		int array[] = { 30, 40, 50, 60, 70};
		
		
		int max = array[0];
		int max2 = 0;
		
		for(int i : array) {
			if(i> max) {
				max2 = max;
				max = i;
			}
		}
		
		
		System.out.println(max2);
	}

}
