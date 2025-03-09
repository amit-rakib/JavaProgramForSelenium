package NoteOfSelenium;

public class RemoveWhiteSpacesInaString {

	public static void main(String[] args) {
         
		String str = "Hello World I am Amit";
		
		String str1 = str.replaceAll(" ", "");
		
		
		System.out.println(str1);
		
	}

}
