package NoteOfSelenium;

public class CountCharacterOccurance {

	public static void main(String[] args) {
          
		 String str = "Hello World Java";
		 
		 
		 int count = 1;
		 
		 
		 int len = str.length();
		 
		 for(int i = 0; i< len; i++) {
			 
			 if(str.charAt(i) == ' ' && str.charAt(i+1) != ' ' ) {
				 count++;
			 }
		 }
		 
		 System.out.println(count);
	}

}
