public class BinarySearch {

    public static void main(String[] args) {
        
        int array[] = {100, 200, 300, 400, 500};
        int searchElement = 200;
        int low = 0, high = array.length - 1, mid;
        
        while (low <= high) {
            mid = (low + high) / 2; // Always update mid
            
            if (array[mid] == searchElement) {
                System.out.println("Found at location " + (mid + 1));
                return; // Exit once found
            } else if (array[mid] < searchElement) {
                low = mid + 1;  // Search in the right half
            } else {
                high = mid - 1; // Search in the left half
            }
        }

        // This executes only if element is not found
        System.out.println("Not found");
    }
}

