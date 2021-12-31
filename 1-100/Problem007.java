public class Problem007 {
    public static int answer() {
        int number = 0, count = 1;
        for (int i = 3; i > 0; i += 2) {
            int flag = 0;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    flag++;
                    break;
                }
            }
            if (flag == 0) {
                count++;
            }
            if (count == 10001) {
                number = i;
                break;
            }
        }
        return number;
    }
}