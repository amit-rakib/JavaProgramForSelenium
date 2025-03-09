package NoteOfSelenium;

public class PalindromeString {

	public static void main(String[] args) {
         
		String str = "DAD";
		
		String Rev = "";
		
		
		for(int i=str.length()-1; i>=0; i--) {
			
			Rev = Rev + str.charAt(i);
			
		}
		
		if(Rev.equals(str)) {
			System.out.println("Its a Palindrome");
		} else {
			System.out.println("Its not a Palindrome");
		}
		
		
	}

}
