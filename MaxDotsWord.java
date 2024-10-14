public class MaxDotsWord {
    public static String wordWithMaxDots(String sentence) {
        // Split the sentence into words using space as the delimiter
        String[] words = sentence.split(" ");

        // Initialize variables to track the word with the maximum dots
        String maxDotsWord = "";
        int maxDotsCount = 0;

        // Traverse each word in the array
        for (String word : words) {
            // Count the number of dots in the current word
            int dotCount = 0;
            for (char ch : word.toCharArray()) {
                if (ch == '.') {
                    dotCount++;
                }
            }

            // If the current word has more dots, update maxDotsWord and maxDotsCount
            if (dotCount > maxDotsCount) {
                maxDotsCount = dotCount;
                maxDotsWord = word;
            }
        }

        // Return the word with the maximum number of dots
        return maxDotsWord;
    }

    public static void main(String[] args) {
        // Test case
        String sentence = "hello... world.. a.b.c";
        System.out.println("Word with max dots: " + wordWithMaxDots(sentence));  // Output: hello...
    }
}
