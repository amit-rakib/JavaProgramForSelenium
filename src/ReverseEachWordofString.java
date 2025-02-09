
public class ReverseEachWordofString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String text = "Selenium Automation Java";
		
		String[] words = text.split(" ");
		String reverse = "";
		
		
		for(int i = 0; i<words.length; i++) {
			
			String word = words[i];
			String reverseWord = "";
			
			for(int j = word.length()-1; j>=0; j--) {
				reverseWord = reverseWord + word.charAt(j);
			}
			System.out.println(reverseWord);

			
			reverse = reverse + reverseWord + " ";
		}
		
		
		
		System.out.println(reverse);

	}

}
