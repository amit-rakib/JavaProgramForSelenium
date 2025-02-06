
public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[]= {200, 300, 400, 500, 600};
		
		int searchElement = 400;
		
		for(int i=0; i<array.length; i++) {
			if(array[i] == searchElement) {
				 System.out.println(i+1);
				 return;
				
			} 
		}
		
		System.out.println("Not found");


	}

}
