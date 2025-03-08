package NoteOfSelenium;

import java.util.Random;

public class GenerateRandomNumber {

	public static void main(String[] args) {
          
		
		
		// First Way
		Random random = new Random();
		
		for(int i =0; i<5; i++) {
			System.out.println(random.nextInt(50));
		}
		
		
		
		// Second Way
		for(int i=0; i<5; i++) {
			System.out.println( (int) (Math.random()*50));
		}
		
		
		
	}

}
