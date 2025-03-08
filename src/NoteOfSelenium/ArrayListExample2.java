package NoteOfSelenium;

import java.util.ArrayList;

public class ArrayListExample2 {

	public static void main(String[] args) {
        
		
		ArrayList<Object> array = new ArrayList<>();
		
		
		array.add("Amit");
		array.add(9);
		array.add(9.9);
		array.add(true);
		
		
		System.out.println(array.size());
		
		array.remove(2);
		
		array.add(2, 10.5);
		
		for(Object a: array) {
			System.out.println(a);
		}
		
		
		
		System.out.println(array.get(0));
		
		
	}

}
