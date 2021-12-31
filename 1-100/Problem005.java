public class Problem005 {
    public static int answer() {
        int number = 0;
        for (int i = 20; i >= 0; i += 20) {
            int flag = 0;
            for (int j = 1; j <= 20; j++) {
                if (i % j != 0) {
                    flag++;
                    break;
                }
            }
            if (flag == 0) {
                number = i;
                break;
            }
        }
        return number;
    }
}