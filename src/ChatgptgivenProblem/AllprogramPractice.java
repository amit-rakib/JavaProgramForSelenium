package ChatgptgivenProblem;

public class AllprogramPractice {

	public static void main(String[] args) {
         
		
		
		
		reverseString();
		
		
	}

	private static void reverseString() {
           
		
		String str = "Hello World!";
		
		String str2 = "";
		
		
		for(int i=str.length()-1; i>=0; i--) {
			str2 += str.charAt(i);
		}
		
		System.out.println("Reverse string: "+ str2);
	}

}
