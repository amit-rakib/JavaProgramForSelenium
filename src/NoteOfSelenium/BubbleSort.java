package NoteOfSelenium;

public class BubbleSort {

	public static void main(String[] args) {
		
          int array[] = {7, 4, 5, 3, 2, 6};
          
          
          int len = array.length;
          
          int swap;
          
          for(int i =0;  i<len; i++) {
        	  
        	  for(int j = 0; j<len-i-1; j++) {
        		  
        		  if(array[j] > array[j+1]) {
        			  swap = array[j];
        			  array[j] = array[j+1];
        			  array[j+1]=swap;
        		  }
        		  
        	  }
        	  
        	  System.out.println();
        	  for(int a: array) {
        		  System.out.print(a+ " ");
        	  }
        	  
          }
          
          
	}

}
