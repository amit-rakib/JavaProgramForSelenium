package amit;

import java.util.Arrays;

public class margeTwoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		int array1[] = { 1, 2, 3, 4, 5};
		int array2[] = { 1, 2, 3, 2, 1};
		
		int merge[] = new int[array1.length+array2.length];
		
		for(int i = 0, j=0; i<=array1.length-1; i++, j++) {
			merge[j]=array1[i];
		}
		for(int i = 0, j=array1.length; i<=array2.length-1; i++, j++) {
			merge[j]=array2[i];
		}
		
		System.out.println(Arrays.toString(merge));


	}

}
