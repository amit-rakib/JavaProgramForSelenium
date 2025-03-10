package MKT;

public class PalindromeString {

	public static void main(String[] args) {
         
		
		String str = "anna";
		String str2 = "";
		
		for(int i = str.length()-1; i>=0; i--) {
			
			str2 = str2 + str.charAt(i);
		}
		
		if(str2.equals(str)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("not a Palindrome");
		}
	}

}
