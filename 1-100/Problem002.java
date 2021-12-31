public class Problem002 {
    public static int answer() {
        int a = 1, b = 1, c = 0;
        int sum = 0;
        while (c < 4000000) {
            c = a + b;
            a = b;
            b = c;
            if (c % 2 == 0) {
                sum += c;
            }
        }
        return sum;
    }
}