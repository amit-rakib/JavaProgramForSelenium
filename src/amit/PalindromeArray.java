package amit;

import java.util.Arrays;

public class PalindromeArray {
	
	public static void main(String[] args) {
	
	int array[] = { 1, 2, 3, 2, 1};
	
	int reverse[] = new int[array.length];
	
	for(int i=array.length-1, j =0; i>=0; i--, j++) {
		  reverse[j] =  array[i];
	}
	
	if(Arrays.equals(reverse, array)) {
		System.out.println("Palindrome");
	} else {
		System.out.println("not");
	}
	
	
	}
}
