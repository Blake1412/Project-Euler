package src;

import java.math.*;

public class Problem016 {
    public static int answer() {
        int sum = 0;
        BigInteger number = BigInteger.valueOf(2);
        number = number.pow(1000);
        for (int i = 0; i < number.toString().length(); i++) {
            sum += Character.getNumericValue(number.toString().charAt(i));
        }
        return sum;
    }
}