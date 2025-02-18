package amit;

public class MaxMinInArray {
	public static void main(String[] args) {

		int array[] = { 40, 70, 20, 500, 600, 200 };
		
		int max = array[0];
		int min = array[0];
		
		
		for(int i = 0; i< array.length; i++) {
			if(array[i]>max) {
				max = array[i];
			}
		}
		
		
		for(int i = 0; i<array.length; i++) {
			if(array[i] < min) {
				min = array[i];
			}
		}
		
		
		System.out.println(max);
		System.out.println(min);
		
		// Another way using other for loop
		
		
		int max2 = array[0];
		int min2 = array[0];
		
		for(int i : array) {
			if(i>max2) {
				max2 = i;
			}
		}
		
		for(int i : array) {
			if(i<min2) {
				min2 = i;
			}
		}
		
		System.out.println(max2);
		System.out.println(min2);
		
		

	}
}
