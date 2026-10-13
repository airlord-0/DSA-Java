package Problems;

public class palindrome {

    public static void main(String[] args) {

        for (int num = 1; num <= 1000; num++) {

            int original = num;
            int reversed = 0;

            while (num > 0) {
                int digit = num % 10;
                reversed = reversed * 10 + digit;
                num /= 10;
            }

            if (original == reversed) {
                System.out.println(original);
            }

            num = original;
        }
    }

}
