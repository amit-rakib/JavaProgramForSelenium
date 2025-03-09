package NoteOfSelenium;

public class GreatestOfThreeNumber {

	public static void main(String[] args) {
          
		int a, b, c;
        
		
		a = 100;
		b = 400;
		c = 50;
		
		
		if(a > b && a > c) {
			System.out.println(a);
		} else if(b > a && b > c) {
			System.out.println(b);
		} else {
			System.out.println(c);
		}
		
	}

}
