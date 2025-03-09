package NoteOfSelenium;

public class GreatestOfThreeNumberUsingMethod {

	public static void main(String[] args) {
             
		
		int a, b, c;
		
		a = 200;
		b = 300;
		c = 100;
		
		int max = findGreatest(a, b, c);
		
		System.out.println(max);
		
	}

	private static int findGreatest(int a, int b, int c) {
        
		int max1 = Math.max(a, b);
		
		int max2 = Math.max(max1, c);
		
		return max2;
		
	}

}
