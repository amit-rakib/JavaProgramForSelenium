package NoteOfSelenium;

import java.util.ArrayList;

public class ArrayListExample1 {

	public static void main(String[] args) {
        
		ArrayList<String> arr = new ArrayList<String>();
		
		
		
		arr.add("Amit");
		arr.add("Rakib");
		
		
		System.out.println(arr.size());
		
		
		for(String a: arr) {
			System.out.println(a);
		}
		
		
	}

}
