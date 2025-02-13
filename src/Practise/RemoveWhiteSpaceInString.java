package Practise;

public class RemoveWhiteSpaceInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 
		String text = "   Remove       white     Space    From String     ";
		
		String a = text.replaceAll("\\s", "");
		System.out.println(a);

	}

}
