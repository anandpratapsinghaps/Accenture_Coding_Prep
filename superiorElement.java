import java.util.*;
public class superiorElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int res = findNumberOfSuperiorElement(arr, n);
        System.out.println(res);
        sc.close();
    }

    public static int findNumberOfSuperiorElement(int arr[] ,int n){
        int count = 0;
        int superior = Integer.MIN_VALUE;
        for(int i=n-1; i>=0; i--){
            if(arr[i] > superior){
                count++;
                superior = arr[i];
            }
        }
        return count;        
    }
}
