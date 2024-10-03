import java.util.Scanner;
public class reverseString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of String : ");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter your string : ");
        String s = sc.nextLine();
        System.out.println(new StringBuilder(s).reverse().toString());
    }
}
