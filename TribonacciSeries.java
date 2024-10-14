import java.util.Arrays;

public class TribonacciSeries {
    
    public static int[] generateTribonacci(int n) {
        // Handle edge cases for n
        if (n <= 0) {
            return new int[0]; // Return empty array for non-positive input
        } else if (n == 1) {
            return new int[]{0}; // Return array with first element
        } else if (n == 2) {
            return new int[]{0, 1}; // Return array with first two elements
        } else if (n == 3) {
            return new int[]{0, 1, 1}; // Return array with first three elements
        }

        // Initialize the Tribonacci array
        int[] tribonacci = new int[n];
        tribonacci[0] = 0; // First term
        tribonacci[1] = 1; // Second term
        tribonacci[2] = 1; // Third term

        // Generate the rest of the series
        for (int i = 3; i < n; i++) {
            tribonacci[i] = tribonacci[i - 1] + tribonacci[i - 2] + tribonacci[i - 3];
        }

        return tribonacci; // Return the complete Tribonacci series
    }

    public static void main(String[] args) {
        // Test cases
        int[] result1 = generateTribonacci(10);
        System.out.println(Arrays.toString(result1)); // Expected: [0, 1, 1, 2, 4, 7, 13, 24, 44, 81]

        int[] result2 = generateTribonacci(5);
        System.out.println(Arrays.toString(result2)); // Expected: [0, 1, 1, 2, 4]

        int[] result3 = generateTribonacci(1);
        System.out.println(Arrays.toString(result3)); // Expected: [0]

        int[] result4 = generateTribonacci(0);
        System.out.println(Arrays.toString(result4)); // Expected: []
    }
}
