
public class Test {

	public static void main(String[] args) {
		
		int array[] = { 200, 400, 300, 900, 500};
		
		for(int i = 0; i<array.length; i++) {
			for(int j=0; j<array.length-i-1; j++) {
				
				if(array[i]> array[i+1]) {
					int swap = array[i];
					array[i] = array[i+1];
					array[i+1] = swap;
				}
			}
		}
		
		for(int i : array) {
			System.out.println(i);

		}
		
		int search = 400;
		int low = 0;
		int high = array.length;
		
		while(low <= high) {
			int mid = (low+high)/2;
			
			if(array[mid] == search) {
				System.out.println(mid+1);
				//return;
				break;
			} else if(array[mid] < search){
				low = mid+1;
			} else {
				high = mid-1;
			}
			
		}
		int sea = 900;
		
		for(int i = 0; i<array.length; i++) {
			if(array[i] == sea) {
				System.out.println("Linear: "+ (i+1));
			} 
		}
		
		
		String text  = "Hello world hello";
	text =	text.trim();
		int count = 1;
		for(int i = 0; i< text.length(); i++) {
			if(text.charAt(i) == ' ' && text.charAt(i+1) != ' ') {
				count++;
			}
			
			
		}
		
		System.out.println(count);

		
	}

}
