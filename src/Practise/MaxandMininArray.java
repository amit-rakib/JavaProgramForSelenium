package Practise;

public class MaxandMininArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[] = { 200, 300, 500, 100, 700};
		
		int max = 0;
		int min = array[0];
		
		for(int i = 0; i< array.length; i++) {
			if(array[i]> max) {
				max = array[i];
			}
		}
		
		for(int i =0; i<array.length; i++) {
			if(array[i]<min) {
				min = array[i];
			}
		}
		
		
		System.out.println("max: "+ max + " min: "+ min);

	}

}
