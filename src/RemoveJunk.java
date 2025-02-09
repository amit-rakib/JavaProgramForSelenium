
public class RemoveJunk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String  text = "£@$&& *)&)&) )&)Amit££$* Rakib";
		
		text = text.replaceAll("[^a-zA-z0-9]", "");
		
		System.out.println(text);

	}

}
