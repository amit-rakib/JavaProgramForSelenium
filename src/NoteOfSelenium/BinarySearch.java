package NoteOfSelenium;

public class BinarySearch {

	public static void main(String[] args) {
        
		int array[] = { 20, 30, 40, 50, 60};
		int searchElement = 50;
		
		int len = array.length;
		
		
		int low = 0;
		int high = len-1;
		
		
		while(low<=high) {
			
			int mid = (low+high)/2;
			
			if(array[mid] == searchElement) {
				System.out.println("Found At "+(mid+1));
				break;
			} else if(array[mid] > searchElement) {
				high = mid-1;
			} else {
				low = mid+1;
			}
			
			
		}
		
		if(low>high) {
			System.out.println("Not Present");
		}
		
		
	}

}
