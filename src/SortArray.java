import java.lang.reflect.Array;
import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int array[] = {3, 2, 1, 5, 4};
		
		Arrays.sort(array);
		
		for(int i: array) {
			System.out.println(i);
		}
		
		
		
		String array2[] = {"z", "a", "c"};
		
		Arrays.sort(array2);
		
		for(String i : array2) {
			System.out.println(i);
		}

	}

}
