
public class Problem21 {
    private static int sumOfFactors(int n) {
        int sum = 1;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static int answer() {
        int sum = 0;
        for (int i = 2; i < 10000; i++) {
            int j = sumOfFactors(i);
            if (j > i) {
                if (sumOfFactors(j) == i) {
                    sum += i + j;
                }
            }
        }
        return sum;
    }
}