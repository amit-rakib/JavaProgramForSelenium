
public class EvenAndOddNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int array[] = { 1, 3, 5, 7, 4, 6, 60, 12, 44 };
		
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] % 2 == 0) {
				System.out.println("Even: "+array[i]);
			}
			
		}
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] % 2 != 0) {
				System.out.println("Odd: "+array[i]);
			}
		}

	}

}
