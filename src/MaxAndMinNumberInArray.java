
public class MaxAndMinNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[] = { 10, 5, 7, 9, 23, 70 };
		
		int max = array[0];
		int min = array[0];
		
		for (int i = 0; i<array.length; i++) {
			if(array[i]>max) {
				max = array[i];
			}
		}
		
		for (int i = 0; i< array.length; i++) {
			if(array[i]<min) {
				min = array[i];
			}
		}
		
		System.out.println("Max: "+max);
		System.out.println("Min: "+min);


	}

}
