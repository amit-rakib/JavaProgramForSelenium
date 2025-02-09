
public class SearchStringinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String array[] = { "abc", "xyx", "ete", "xyz", "amit"};
		
        String searchString = "amit";
         boolean flag = false;
        
        
        for (String i : array) {
        	if(i == searchString) {
        		System.out.println("String Found");
        		flag = true;
        		break;
        	}
        }
        
        
        
        if(flag == false) {
        	System.out.println("Not found");
        	
        }
        
	}
	
}
