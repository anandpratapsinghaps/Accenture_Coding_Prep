public class RatHouses {
    
    public static int foodForRats(int r, int unit, int[] arr) {
        // Check if the array is null
        if (arr == null) {
            return -1;
        }
        
        // Calculate total food required for all rats
        int totalFoodNeeded = r * unit;
        
        // Sum the food in houses until we meet or exceed the required amount
        int currentFood = 0;
        for (int i = 0; i < arr.length; i++) {
            currentFood += arr[i];  // Add food from current house
            
            // Check if we have enough food for all rats
            if (currentFood >= totalFoodNeeded) {
                return i + 1;  // Return the number of houses needed (1-based index)
            }
        }
        
        // If the loop completes and we don't have enough food, return 0
        return 0;
    }

    public static void main(String[] args) {
        // Example Input
        int r = 7;  // Number of rats
        int unit = 2;  // Units of food per rat
        int[] arr = {2, 8, 3, 5, 7, 4, 1, 2};  // Food in each house

        // Call the function and print the result
        int result = foodForRats(r, unit, arr);
        System.out.println(result);  // Expected Output: 4
    }
}
