public class Problem004 {
    public static int answer() {
        int largest = 0;
        for (int i = 100; i < 1000; i++) {
            for (int j = i; j < 1000; j++) {
                int flag = 0;
                String number = String.valueOf(i * j);
                for (int k = 0; k < number.length(); k++) {
                    if (number.charAt(k) != number.charAt(number.length() - 1 - k)) {
                        flag++;
                        break;
                    }
                }
                if (flag == 0 && i * j > largest) {
                    largest = (i * j);
                }
            }
        }
        return largest;
    }
}