package NoteOfSelenium;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicatesFromArrayList {

	public static void main(String[] args) {
           
		ArrayList<String> ar = new ArrayList();
		
		ar.add("Java");
		ar.add("Java");
		ar.add("Hello");
		ar.add("Amit");
		
		
		
		System.out.println(ar);
		
		
		
		
		
		HashSet<String> st = new HashSet<>(ar);
		
		ArrayList<String> newAr = new ArrayList<String>(st);
		
		
		System.out.println(newAr);
	}

}
