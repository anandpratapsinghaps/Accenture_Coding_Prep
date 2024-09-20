import java.util.*;
public class edwardsBirthday {
    private static final int MOD = 1000000007;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(maxPieces(n));
        sc.close();
    }

    public static int maxPieces(int n){
        long max = ((long) n * (n + 1) / 2 + 1);
        return (int)(max % MOD);
    }
}
