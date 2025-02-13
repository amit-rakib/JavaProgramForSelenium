package Practise;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicatesFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList a = new ArrayList();
		
		a.add("Amit");
		a.add("Rakib");
		a.add("Amit");
		
		
		HashSet set = new HashSet(a);
		System.out.println(set);

		
		ArrayList list = new ArrayList(set);
		
		System.out.println(list);

	}

}
