import java.util.Scanner;

public class BinaryDigitSum {
    public static int sumOfBinaryDigits(int n) {
        // Convert the number to binary string
        String binaryString = Integer.toBinaryString(n);
        
        // Initialize sum variable
        int sum = 0;
        
        // Iterate through the binary string and sum the digits
        for (char digit : binaryString.toCharArray()) {
            sum += digit - '0';  // '0' subtracted to convert char to int
        }
        
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        
        int sum = sumOfBinaryDigits(n);
        
        System.out.println("The sum of binary digits of " + n + " is: " + sum);
        
        scanner.close();
    }
}
