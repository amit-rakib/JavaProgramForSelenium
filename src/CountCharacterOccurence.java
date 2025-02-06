
public class CountCharacterOccurence {

	public static void main(String[] args) {

		String text = "Java java";
		
		int count =text.length() - text.replace("a", "").length();
		
		
		System.out.println(count);
		
	}

}
