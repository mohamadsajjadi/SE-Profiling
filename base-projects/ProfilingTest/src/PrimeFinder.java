import java.util.ArrayList;
import java.util.List;

public class PrimeFinder {
    public static void main(String[] args) throws InterruptedException {
        long startTime = System.currentTimeMillis();
        Thread.sleep(30000);
        List<Integer> primes = findPrimesOptimized(100000);
        long endTime = System.currentTimeMillis();

        System.out.println("Number of primes found: " + primes.size());
        System.out.println("Execution Time: " + (endTime - startTime) + " ms");


    }

    public static List<Integer> findPrimesOptimized(int limit) {
        List<Integer> primes = new ArrayList<>();
        if (limit >= 2) primes.add(2);
        for (int i = 3; i <= limit; i += 2) {
            boolean isPrime = true;
            int sqrt = (int) Math.sqrt(i);
            for (int j = 3; j <= sqrt; j += 2) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                primes.add(i);
            }
        }
        return primes;
    }
}
