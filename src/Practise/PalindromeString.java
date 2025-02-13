package Practise;

public class PalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text = "anab";
		
		int n = text.length();
		String rev = "";
				
	    for(int i=n-1; i>=0; i--) {
	    	
	    	 rev = rev + text.charAt(i);
	    }
	    
	    if(text.equalsIgnoreCase(rev)) {
	    	System.out.println("Palindrome");
	    } else {
	    	System.out.println("not");
	    }

	}

}
