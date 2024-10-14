public class LCMCalculator {  

    // Function to calculate GCD  
    static int gcd(int a, int b) {  
        if (b == 0)  
            return a;  
        return gcd(b, a % b);  
    }  

    // Function to calculate LCM  
    static int lcm(int a, int b) {  
        return Math.abs(a * b) / gcd(a, b);  
    }  

    public static void main(String[] args) {  
        int num1 = 12;  
        int num2 = 18;  
        System.out.println("The LCM of " + num1 + " and " + num2 + " is " + lcm(num1, num2));  
    }  
}