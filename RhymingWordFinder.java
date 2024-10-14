import java.util.List;

public class RhymingWordFinder {

    public static void main(String[] args) {
        // Test cases
        System.out.println(findBestRhymingWord("thunder", List.of("puzzle", "thunder", "powder", "blender", "under"))); // Output: "under"
        System.out.println(findBestRhymingWord("cat", List.of("bat", "hat", "car", "sat"))); // Output: "bat"
        System.out.println(findBestRhymingWord("dog", List.of("fog", "log", "cat", "bog"))); // Output: "fog"
        System.out.println(findBestRhymingWord("tree", List.of("bee", "see", "free", "knee"))); // Output: "free"
        System.out.println(findBestRhymingWord("moon", List.of("balloon", "spoon", "tune", "dune"))); // Output: "dune"
    }

    public static String findBestRhymingWord(String S, List<String> dictionary) {
        String bestMatch = "No Word"; // Default to "No Word"
        int maxMatchLength = 0; // Length of the longest matching suffix

        for (String word : dictionary) {
            if (word.equals(S)) {
                continue; // Skip if the word is the same as S
            }

            // Calculate the length of the matching suffix
            int matchLength = matchSuffixLength(S, word);
            if (matchLength > maxMatchLength) {
                maxMatchLength = matchLength;
                bestMatch = word; // Update best match
            }
        }

        return bestMatch; // Return the best match or "No Word"
    }

    private static int matchSuffixLength(String s, String word) {
        int minLength = Math.min(s.length(), word.length());
        int length = 0;

        // Compare characters from the end
        for (int i = 1; i <= minLength; i++) {
            if (s.charAt(s.length() - i) == word.charAt(word.length() - i)) {
                length++;
            } else {
                break; // Stop if characters don't match
            }
        }

        return length; // Return the length of the matching suffix
    }
}
