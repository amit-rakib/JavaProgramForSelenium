package NoteOfSelenium;

public class EvenAndOddNumbersInArray {

	public static void main(String[] args) {
         
		
		int array[] = { 2, 3, 4, 5, 6, 7, 9};
		
		int len = array.length;
		
		
		for( int i = 0; i<len; i++) {
			if(array[i]%2 == 0) {
				System.out.println("Even");
			}else {
				System.out.println("Odd");
			}
			
		}
		

	}

}
