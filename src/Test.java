import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Test {
	
    public static void main(String[] args) {
		
       int a[]= { 3, 4, 5, 6, 7, 9};
       
       
       System.out.println(Arrays.binarySearch(a, 7));
       
       for(int i=0; i<a.length; i++) {
    	   
    	   
    	 //  i[0] = 3
    	   
    	   for(int j = 1; j<a.length-1; j++ ) {
    		   if(a[i]> a[j]) {
    			   int swap = a[i];
    			   a[i] = a[j];
    			   a[j]=swap;
    		   }
    	   }
       }
       for(int i : a) {
       System.out.print(i);
       }
        
	}
	
}
