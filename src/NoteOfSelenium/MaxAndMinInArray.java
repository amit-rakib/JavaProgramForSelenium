package NoteOfSelenium;

public class MaxAndMinInArray {

	public static void main(String[] args) {
           
		int array[] = { 200, 100, 400, 600, 500, 900, 1000};
		
		int max = array[0];
		int min = array[0];
		
		
		for (int i = 0; i<array.length; i++) {
			
			if(max < array[i]) {
				max = array[i];
			}
			
			if(min > array[i]) {
				min = array[i];
			}
		}
		
		System.out.println(max);
		System.out.println(min);

		
	}

}
