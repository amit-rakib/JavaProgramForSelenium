
public class BubbleSort {

	public static void main(String[] args) {
		
		// Compares two elements and swaps them if they were wrong order
		
		int array[] = {3, 6, 2, 8, 9, 7};
		
		int size = array.length;
		int swap;
		
		System.out.println("Before Sorting:");
		for (int a : array) {
			System.out.print(a+" ");
		}
		
		
		for (int i=0; i<size; i++) {
			
			for(int j=0; j<size-i-1; j++) {
				if(array[j] > array[j+1]) {
					
					swap = array[j];
					array[j]= array[j+1];
					array[j+1]=swap;
				}
			}
			System.out.println();
			for (int a : array) {
				System.out.print(a+" ");
			
			}
		}
	
		System.out.println();
		System.out.println("After Sorting:");
		for (int a : array) {
			System.out.print(a+" ");
		
		}
		
		

	}

}
	
