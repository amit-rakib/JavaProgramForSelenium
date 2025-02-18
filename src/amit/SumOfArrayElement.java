package amit;

public class SumOfArrayElement {
	
	public static void main(String[] args) {
		int array[] = { 1, 2, 3, 4, 5, 6};
		
		int sum = 0;
		
		for(int i : array) {
			 sum = sum+i;
		}
		
		System.out.println("First sum: "+ sum);
		
		
		int summ = 0;
		
		for(int i = 0; i<array.length; i++) {
			summ = summ + array[i];
		}
		
		System.out.println("Second sum: "+ summ);
		
		
	}

}
