import java.util.*;
public class sumOfOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int res = SumOdOddIntegers(arr, n);
        System.out.println(res);
        sc.close();
    }

    public static int SumOdOddIntegers(int arr[], int n){
        int sum = 0;
        for(int i=0; i<n; i++){
            if(arr[i] % 2 != 0){
                sum += arr[i];
            }
        }
        return sum;
    }
}
