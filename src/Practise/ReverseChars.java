package Practise;

public class ReverseChars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text = " Hello World";
		
		String revChar ="";
		
		int n = text.length();
		
		for(int i = n-1; i>0; i--) {
			revChar = revChar + text.charAt(i);
		}
		
		System.out.println(revChar);

	}

}
