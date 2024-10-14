import java.util.Scanner;

public class perfectNum {
    // Method to check if a number is perfect
    public static boolean isPerfectNumber(int n) {
        // Initialize the sum of divisors
        int sum = 0;
        
        // Loop to find proper divisors and sum them
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        
        // Check if the sum of divisors equals the number itself
        return sum == n;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        
        if (isPerfectNumber(n)) {
            System.out.println(n + " is a perfect number.");
        } else {
            System.out.println(n + " is not a perfect number.");
        }
        
        scanner.close();
    }
}
