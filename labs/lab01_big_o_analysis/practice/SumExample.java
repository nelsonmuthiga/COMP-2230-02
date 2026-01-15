public class SumExample {
    // Method 1: Using loop - O(n) time, O(1) space
    public static long sumLoop(int n) {
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    // Method 2: Using recursion - O(n) time, O(n) space (call stack)
    public static long sumRecursive(int n) {
        if (n == 0) return 0;
        return n + sumRecursive(n - 1);
    }

    // Method 3: Using formula - O(1) time, O(1) space
    public static long sumFormula(int n) {
        return (long) n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        int n = 100000; // Large n to see time differences

        // Measure Loop
        long start = System.nanoTime();
        long result1 = sumLoop(n);
        long time1 = System.nanoTime() - start;
        System.out.println("Loop Sum: " + result1 + ", Time: " + time1 + " ns");

        // Measure Recursive
        start = System.nanoTime();
        long result2 = sumRecursive(n);
        long time2 = System.nanoTime() - start;
        System.out.println("Recursive Sum: " + result2 + ", Time: " + time2 + " ns");

        // Measure Formula
        start = System.nanoTime();
        long result3 = sumFormula(n);
        long time3 = System.nanoTime() - start;
        System.out.println("Formula Sum: " + result3 + ", Time: " + time3 + " ns");

        
        // Practice Questions:
        // 1. Which method has the best time complexity? Why?
        // 2. Which method uses the most space? Why?
        // 3. For small n, which method would you choose? For large n?
    }
}