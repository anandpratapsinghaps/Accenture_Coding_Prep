import java.util.HashMap;
import java.util.Map;
public class maxFreqElement {
    public static int findHighestFrequency(int[] arr) {
        if (arr == null || arr.length == 0) {
            return -1; 
        }
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        int maxFrequency = 0; 
        int numberWithMaxFreq = arr[0]; 
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            int currentNum = entry.getKey();
            int currentFreq = entry.getValue();
            if (currentFreq > maxFrequency || (currentFreq == maxFrequency && currentNum > numberWithMaxFreq)) {
                maxFrequency = currentFreq;
                numberWithMaxFreq = currentNum;
            }
        }

        return numberWithMaxFreq; 
    }

    public static void main(String[] args) {
        // Test cases
        int[] arr1 = {1, 3, 2, 1, 4, 2, 1};
        int result1 = findHighestFrequency(arr1);
        System.out.println(result1); // Expected: 1

        int[] arr2 = {5, 3, 5, 2, 3, 5, 3};
        int result2 = findHighestFrequency(arr2);
        System.out.println(result2); // Expected: 5

        int[] arr3 = {7, 7, 8, 8, 8, 7};
        int result3 = findHighestFrequency(arr3);
        System.out.println(result3); // Expected: 8 (as 8 has the same frequency but is larger)

        int[] arr4 = {}; // Empty array
        int result4 = findHighestFrequency(arr4);
        System.out.println(result4); // Expected: -1

        int[] arr5 = null; // Null array
        int result5 = findHighestFrequency(arr5);
        System.out.println(result5); // Expected: -1
    }
}


