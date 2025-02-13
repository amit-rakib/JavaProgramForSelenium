package Practise;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 121;
		int rev = 0;
		int or = 121;
		
		while(num != 0) {
			int digit  = num % 10;
			
			rev = rev * 10 + digit;
			
			num = num / 10;
		}
		
		if(rev == or ) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not");
		}

	}

}
