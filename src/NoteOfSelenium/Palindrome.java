package NoteOfSelenium;

public class Palindrome {

	public static void main(String[] args) {
        
		
		
		int OrginalNum = 121;
		
		int num = OrginalNum;
		
		int ReverseNum = 0;
		
		while(num>0) {
			int digit = num % 10;
			
			ReverseNum = ReverseNum * 10 + digit;
			
			num = num / 10;
		}
		
		if(ReverseNum == OrginalNum) {
			System.out.println("Is a Palindrome");
		} else {
			System.out.println("Not a Palindrome");
		}
		
		
	}

}
