public class LastJobWaitTime {

    // Method to calculate the waiting time for the last job
    public static int lastJobWaitTime(int m, int n) {
        if (m <= 0) {
            throw new IllegalArgumentException("Number of jobs must be positive.");
        }

        // Waiting time for the last job (m-1 previous jobs, each taking 10 units + n interval)
        return (m - 1) * (10 + n);
    }

    public static void main(String[] args) {
        // Example input: m is the number of jobs, n is the interval between jobs
        int m = 5;  // Number of jobs
        int n = 10; // Interval after each job (in units)

        // Call the method and print the waiting time for the last job
        System.out.println("Waiting time for the last job: " + lastJobWaitTime(m, n) + " units");
        // Output: 80 units (since the first 4 jobs need 10 units + 10 units wait each)
    }
}
