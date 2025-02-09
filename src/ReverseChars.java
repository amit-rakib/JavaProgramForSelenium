
public class ReverseChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text = "Selenium Automation Testing Java";
		
		int size = text.length();
		String reverseText = "";
		
		for(int i = size-1; i>= 0; i--) {
			reverseText = reverseText + text.charAt(i);
		}
		
		System.out.println(reverseText);

	}

}
