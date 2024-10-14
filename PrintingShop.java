public class PrintingShop {

    public static void main(String[] args) {
        int N = 3; 
        int X = 10; 
        
        System.out.println(optimizedSolution(N, X));
    }

    public static int optimizedSolution(int N, int X) {
        int totalPrintTime = (N - 1) * 10;
        int lastJobArrivalTime = (N - 1) * X;
        
        return Math.max(0, totalPrintTime - lastJobArrivalTime);
    }
}
