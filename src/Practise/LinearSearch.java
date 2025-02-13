package Practise;

public class LinearSearch {

	public static void main(String[] args) {
       
		int array[] = { 200, 300, 500, 400, 700, 600};
		
		int search = 600;
		
		
		for(int i = 0; i<array.length; i++) {
			if(search == array[i]) {
				System.out.println(i+1);
			}
		}
		
	}

}
