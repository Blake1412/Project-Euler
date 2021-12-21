public class Problem9 {
    public static int answer() {
        int product = 0;
        for (int a = 1; a < 999; a++) {
            for (int b = a + 1; b < 1000; b++) {
                int c = 1000 - a - b;
                if (a*a + b*b == c*c) {
                    product = a * b * c;
                    break;
                }
            }
        }
        return product;
    }
}