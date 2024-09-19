import java.util.*;
public class singleDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n > 9){
            if(n % 2 != 0){
                n = n/2;
            } else{
                n = (n-2)/2;
            }
        }
        System.out.println(n);
        sc.close();
    }
}
