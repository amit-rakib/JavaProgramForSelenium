import java.util.Random;

public class GenerateRandomNumbersInGivenRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random random = new Random();
		
		for(int i=0; i<5; i++) {
			System.out.println(random.nextInt(50));
		}
		
		
		for(int i=0; i<5; i++) {
			System.out.println((int)(Math.random()*50));
		}
	}

}
