package Practise;

public class NumberOfDigits {

	public static void main(String[] args) {
        
		int count  =0;
		int num = 3524;
		
		
		while(num !=0) {
			
			num = num /10;
			System.out.println(num);

			count ++;
		}
		
		
		System.out.println(count);
		
	}

}
