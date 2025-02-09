
public class Test {

	public static void main(String[] args) {
		
		int num = 125;
		
		int a = num;
	int	b = 0;
		
		while(num>0) {
			int digit = num%10;
			b = b*10+digit;
			num = num/10;
		}
		
		if(a == b) {
			System.out.println("Plau");
		}
	}

}
