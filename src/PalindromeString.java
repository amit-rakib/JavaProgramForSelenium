
public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text = "madam";
		
		int left = text.charAt(0);
		int right = text.charAt(text.length()-1);
		
	   while(left < right) {
		   if(left != right) {
			   System.out.println("Not a Palindrome");
			   return;
		   }
		   left++;
		   right++;
	   }
	   System.out.println("Palindrome");

	}

}
