package amit;

public class SearchAnElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[] = { 20, 30, 40, 50, 60};
		
		int search = 500;
		
		boolean flag = false;
		
		for (int i = 0; i<array.length; i++) {
			if(array[i] == search) {
				System.out.println("Found at: "+ i+1);
				flag = true;
				
			} 
		}
		
		if(flag == false) {
		System.out.println("Not found");
		}

	}

}
