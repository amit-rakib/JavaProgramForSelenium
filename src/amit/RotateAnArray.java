package amit;

public class RotateAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = { 1, 2, 3, 4, 5, 6 };

		int len = array.length;
		int k = 2;
		k = k % len;

		reverse(0, len - 1, array);
		reverse(0, k - 1, array);
		reverse(k, len - 1, array);

		for (int i : array) {
			System.out.print(i + ", ");
		}
		

	}

	private static void reverse(int start, int end, int[] array) {
		// TODO Auto-generated method stub

		while (start < end) {

			int temp = array[start];
			array[start] = array[end];
			array[end] = temp;

			start++;
			end--;

		}

	}

}
