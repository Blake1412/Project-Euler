public class Problem3 {
    public static long answer() {
        long number = 600851475143L;
        long largest = 0;
        for (long i = 1; i < Math.sqrt(number); i++) {
            int flag = 0;
            if (number % i == 0) {
                for (int j = 2; j < Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        flag++;
                        break;
                    }
                }
                if (flag == 0) {
                    largest = i;
                }
            }
        }
        return largest;
    }
}