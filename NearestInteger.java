public class NearestInteger {
    public static int nearestInteger(int num, int m) {
        // Find the quotient when num is divided by m
        int quotient = num / m;

        // Calculate two possible multiples of m: one smaller than or equal to num and one larger
        int n1 = m * quotient;       // Closest multiple of m less than or equal to num
        int n2 = m * (quotient + 1); // Closest multiple of m greater than num

        // Calculate the absolute differences between num and the two candidates
        int diff1 = Math.abs(num - n1);
        int diff2 = Math.abs(num - n2);

        // Return the one with the smaller difference, or the larger one if the differences are equal
        if (diff1 < diff2) {
            return n1;
        } else {
            return n2;
        }
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(nearestInteger(67, 8));  // Output: 64
        System.out.println(nearestInteger(26, 3));  // Output: 27
    }
}
