import java.util.ArrayList;

public class ArrayListExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Amit");
		list.add("Rakib");
		list.add("Rakib");
		
		System.out.println(list.size());
		
        for (String s : list) {
        	System.out.println(s);
        }
	}

}
