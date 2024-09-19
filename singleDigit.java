import java.util.*;
public class singleDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n >= -9 && n <= 9){
            System.out.println(n);
        } else{
            int sign = (n < 0) ? -1 : 1;
            n = Math.abs(n);

            while( n > 9){
                if(n % 2 != 0){
                    n = n/2;
                } else {
                    n = (n-2)/2;
                }
            }
            System.out.println(sign * n);
        }
        sc.close();
    }
}
