import java.util.HashMap;

public class MaxLengthEqualZeroOne {
    public static int findMaxLength(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1); 
        int maxLength = 0; 
        int sum = 0; 

        for (int i = 0; i < nums.length; i++) {
            sum += (nums[i] == 0) ? -1 : 1;
            if (map.containsKey(sum)) {
                maxLength = Math.max(maxLength, i - map.get(sum));
            } else {
                map.put(sum, i);
            }
        }

        return maxLength; 
    }

    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 1, 0, 1}; 
        int result = findMaxLength(nums);
        System.out.println("The maximum length of a contiguous subarray with equal number of 0 and 1 is: " + result);
    }
}
