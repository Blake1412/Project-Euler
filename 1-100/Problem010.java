public class Problem10 {
    public static long answer() {
        long sum = 2;
        for (int i = 3; i < 2000000; i += 2) {
            int flag = 0;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    flag++;
                    break;
                }
            }
            if (flag == 0) {
                sum += i;
            }
        }
        return sum;
    }
}