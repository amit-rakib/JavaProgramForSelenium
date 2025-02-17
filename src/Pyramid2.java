import java.util.Scanner;

public class Pyramid2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a num: ");
		int rows = sc.nextInt();
		
		//int rows = 3;
		
		
		for(int i=1; i<=rows; i++) {
			
			for(int j = 0; j<=rows-i; j++ ) {
				System.out.print(" ");
			}
			
			for(int k = 1; k<=(2*i-1); k++) {
				System.out.print("*");
			}
			
			
			
			System.out.println();
		}
	}
	

}
