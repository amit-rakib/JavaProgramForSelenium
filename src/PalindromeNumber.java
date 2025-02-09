
public class PalindromeNumber {

	public static void main(String[] args) {

		// Palindrome means the first and the last digit
		// of a Number is Same
		// 121 is a Palindrome
		// 123 is not a Palindrome
		
		
		
		int original = 121;
		int num = original;
        int reversed = 0;
		
		while(num>0) {
		
			int digit =	num % 10;
		    reversed = reversed*10+digit;
		   
		    num = num/10;
		 
		}
		
		if(original == reversed) {
			System.out.println("Palindrome");
		}else {
			System.out.println("Not a Palindrome");

		}
		
	}

}
