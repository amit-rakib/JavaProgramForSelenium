package ChatgptgivenProblem;

public class VowelString {
    public static void main(String[] args) {
        String text = "Quality Assurance";
        int count = 0;
        String vowels = "aeiouAEIOU";

        for (char ch : text.toCharArray()) {  // Iterate over each character
            if (vowels.indexOf(ch) != -1) {  // Check if it's a vowel
                count++;
            }
        }

        System.out.println("Number of vowels: " + count);
    }
}

