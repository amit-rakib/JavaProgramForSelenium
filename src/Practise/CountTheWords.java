package Practise;

public class CountTheWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text = "Hello my name is Amit";
		
		int count = 1;
		for(int i = 0; i<text.length(); i++) {
			
			if(text.charAt(i) == ' ' && text.charAt(i+1) != ' ') {
				count ++;
			}
			
		}
		
		
		System.out.println(count);

	}

}
