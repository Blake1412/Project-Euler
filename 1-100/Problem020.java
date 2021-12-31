import java.math.*;

public class Problem20 {
    public static int answer() {
        BigInteger number = BigInteger.valueOf(1);
        for (int i = 100; i > 0; i--) {
            number = number.multiply(BigInteger.valueOf(i));
        }
        int sum = 0;
        for (int i = 0; i < number.toString().length(); i++) {
            sum += Character.getNumericValue(number.toString().charAt(i));
        }
        return sum;
    }
}