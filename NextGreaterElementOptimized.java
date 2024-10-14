import java.util.Stack;
import java.util.Arrays;

public class NextGreaterElementOptimized {

    public static int[] nextGreater(int arr[]) {
        int[] res = new int[arr.length];  // Result array to store the next greater elements
        Stack<Integer> s = new Stack<>();  // Stack to store indices of elements

        // Traverse the array from right to left
        for (int i = arr.length - 1; i >= 0; i--) {
            // Remove elements from the stack that are less than or equal to the current element
            while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
                s.pop();
            }

            // If stack is empty, no greater element is found to the right
            if (s.isEmpty()) {
                res[i] = -1;
            } else {
                // Otherwise, the top of the stack is the next greater element
                res[i] = arr[s.peek()];
            }

            // Push the current element's index onto the stack
            s.push(i);
        }
        
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 10, 8};
        int[] result = nextGreater(arr);

        // Print the result array
        System.out.println("Next Greater Elements: " + Arrays.toString(result));
        // Output: [5, 10, 10, -1, -1]
    }
}
