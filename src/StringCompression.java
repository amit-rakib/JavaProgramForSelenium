
public class StringCompression {
      
	public static void main(String[] args ) {
		
		String str = "aaabbccca";
		
		StringBuilder compressed = new StringBuilder();
		
		int count = 1;
		
		for(int i = 0; i<str.length()-1; i++) {
			
			if(str.charAt(i) == str.charAt(i+1)) {
				count++;
			} else {
				compressed.append(count).append(str.charAt(i));
				count = 1;
			}
		}
		
		compressed.append(count).append(str.charAt(str.length()-1));
		
		
		System.out.println(compressed);
		
	}
	
	
}
