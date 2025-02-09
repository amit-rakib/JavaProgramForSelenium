
public class SearchNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[] = { 200, 300, 400, 500, 600};
		
		int searchNumber = 900;
		
		boolean flag = false;
		
		for(int i : array) {
			if(i == searchNumber) {
				System.out.println("Number Found");
				flag = true;
				break;
			}
		}
		
		if(flag == false) {
			System.out.println("Not found");
		}

	}

}
