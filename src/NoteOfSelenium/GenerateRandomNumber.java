package NoteOfSelenium;

import java.util.Random;

public class GenerateRandomNumber {

	public static void main(String[] args) {
          
		
		
		// First Way using Random class
		Random random = new Random();
		
		for(int i =0; i<5; i++) {
			System.out.println(random.nextInt(50));
		}
		
		
		
		// Second Way using Math Random
		for(int i=0; i<5; i++) {
			System.out.println( (int) (Math.random()*50));
		}
		
		
		
	}

}
