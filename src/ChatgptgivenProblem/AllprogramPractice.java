package ChatgptgivenProblem;

public class AllprogramPractice {

	public static void main(String[] args) {

		reverseString();
		
		primeNumber();
		
		
		
		int n = 5;
        System.out.println("Factorial of " + n + " is: " + factorial(n));


	}

	private static int factorial(int n) {
		 if (n == 0 || n == 1) return 1;
	        return n * factorial(n - 1);
	}

	private static void primeNumber() {
          int num = 1;
           boolean isPrime = false;
          
          if(num == 0 || num == 1) {
        	  isPrime = false;
          }
          
          for(int i = 2; i<= (num/2); i++) {
        	  if(num%i != 0) {
        		  isPrime = true;
        	  }
          }
          
          
          if(isPrime == true) {
        	  System.out.println("Is a Prime Number");
          } 
          
          if(isPrime == false){
        	  System.out.println("Is not Prime Number");
          }
          
	}

	private static void reverseString() {

		String str = "Hello World!";

		String str2 = "";

		for (int i = str.length() - 1; i >= 0; i--) {
			str2 += str.charAt(i);
		}

		System.out.println("Reverse string: " + str2);
	}

}
