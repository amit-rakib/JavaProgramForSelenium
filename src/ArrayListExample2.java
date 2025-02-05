import java.util.ArrayList;

public class ArrayListExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Object> list = new ArrayList<Object>();
		
		list.add("Welcome");
		list.add("100");
		list.add(10.5);
		list.add(true);
		
		System.out.println(list.size());
				
		System.out.println(list.get(2));
		
		System.out.println("Before Inserting: "+list);
		
		list.add(1, "Selenium");
		System.out.println("After Inserting: "+list);
		
		list.remove(3);
		System.out.println("After removing: "+list);
		
		// reading value of list using for loop
		
		for (Object i : list) {
			System.out.println(i);
		}



	}

}
