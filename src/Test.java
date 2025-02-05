
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int array[] = { 100, 200, 300, 400, 500 };
		
		int low = 0;
		int high = array.length -1;
		
		int searchElement = 200;
		
		while (low <= high) {
			int mid = (low+high) / 2;
			
			if(array[mid] == searchElement) {
				System.out.println("Found at location: " + (mid+1));
				return;
			}
			else if(array[mid]<searchElement) {
				low = mid+1;
			}
			else {
				high = mid - 1;
			}
		}
		
		System.out.println("not found");

	}

}
