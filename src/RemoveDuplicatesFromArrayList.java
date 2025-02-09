import java.util.HashSet;

public class RemoveDuplicatesFromArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[] = {1, 2, 3, 2, 4, 1, 6, 5};
		
		HashSet<Integer> newArray = new HashSet<>();
		
		for (int num : array) {
			newArray.add(num);
		}
        System.out.println("Array without duplicates: " + newArray);

	}

}
