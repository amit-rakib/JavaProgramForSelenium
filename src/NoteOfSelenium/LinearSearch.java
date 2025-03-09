package NoteOfSelenium;

public class LinearSearch {

	public static void main(String[] args) {
          
		int array[] = { 200, 300, 400, 100, 600};
		
		int searchElement = 100;
		
		int i;
		
		for(i = 0; i< array.length; i++) {
			
			if(array[i] == searchElement) {
				System.out.println(i+1);
				break;
			}
		}
		
		
		if(i == array.length) {
			System.out.println("Not found");
		}
		
		
	}

}
