package Practise;

public class CountCharacterOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String text = "Hello java helllo java";
		// a
		
     	int Occurance =	text.length() - text.replace("a", "").length();
     	System.out.println(Occurance);
              	

	}

}
