package src;

public class Problem014 {
    public static long answer() {
        long number = 0;
        int largestTerm = 0;
        for (int i = 1; i < 1000000; i++) {
            int count = 1;
            long n = i;
            while (n > 1) {
                if (n % 2 == 0) {
                    n /= 2;
                } else {
                    n = 3 * n + 1;
                }
                count++;
            }
            if (count > largestTerm) {
                largestTerm = count;
                number = i;
            }
        }
        return number;
    }
}