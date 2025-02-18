package amit;

public class FrequencyCounter {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 4};
        
       
        String fr = "";
        
        int count = 1;
        
        for(int i =0; i<arr.length-1; i++) {
        	if(arr[i] == arr[i+1]) {
        		count++;
        	} else {
        		fr += count + ":" +arr[i]+ ", ";
        		count = 1;
        	}

        }
		fr += count + ":" +arr[arr.length-1]+ ", ";

        System.out.print(fr);
        
    }
}

