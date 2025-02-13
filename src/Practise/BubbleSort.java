package Practise;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int array[] = { 3, 5, 6, 2, 9};
		
		int swap = 0;
		
		
		for (int i=0; i<array.length; i++) {
			
			for (int j=0; j<array.length-i-1; j++) {
				
				if(array[j]> array[j+1]) {
					swap = array[j];
					
					array[j] = array[j+1];
					array[j+1] = swap;
				}
				
			}
		}
		
		
		
		for (int i : array) {
			System.out.print(i);
		}

	}

}
