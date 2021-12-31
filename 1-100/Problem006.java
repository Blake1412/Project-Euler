public class Problem006 {
    public static int answer() {
        int sum = 0;
        int square =  (int) Math.pow((100 * 101 / 2), 2);
        for (int i = 1; i <= 100; i++) {
            sum += Math.pow(i, 2);
        }
        return Math.abs(square - sum);
    }
}