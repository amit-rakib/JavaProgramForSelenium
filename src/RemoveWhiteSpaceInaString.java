
public class RemoveWhiteSpaceInaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String text  = "Core Java for      Selenium    Automation    ";
		
		text = text.replaceAll("\\s", "");
		
		System.out.println(text);

	}

}
