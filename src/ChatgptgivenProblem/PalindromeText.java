package ChatgptgivenProblem;

public class PalindromeText {
	
	public static void main(String[] args) {
		String text = "madam";
		
		String org = text;
		
		String reverse = "";
		
		StringBuffer st = new StringBuffer(text);
		
		StringBuffer rev = st.reverse();
		System.out.println(rev);
		
		if(rev.equals(st)) {
			System.out.println("Is a palindrome");
		} else {
			System.out.println("Is not a palindrome");
		}
		boolean flag = false;
		
		for(int i = text.length()-1; i>=0; i--) {
			reverse = reverse + text.charAt(i);
		}
		System.out.println(text);
		for(int i = 0; i<text.length(); i++) {
		if( reverse.charAt(i) == org.charAt(i)) {

		       flag = true;
		} 
		}
		
		if(flag == true) {
			System.out.println("palidrome");
		}
		if(flag == false){
			System.out.println("not");
		}
		
	}
	

}
