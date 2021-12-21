public class Problem12 {
    public static int answer() {
        int number = 0;
        for (int i = 1; i > 0; i++) {
            int count = 0;
            number = (i * (i + 1)) / 2;
            for (int j = 1; j <= Math.sqrt(number); j++) {
                if (number % j == 0) {
                    count += 2; // For every divisor up to the square root, there is a corrosponding divisor above the square root
                }
            }
            if (count > 500) {
                break;
            }
        }
        return number;
    }
}