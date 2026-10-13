package Problems;

public class Isprime {
    public static void PrimeNumber (int number) {
        boolean isprime = number >= 2;
        for (int i = 2; isprime && i <= number / i; i++) {
            if (number % i == 0) {
                isprime = false;
                break;
            }
        }
        System.out.println(number + (isprime ? " is prime number" : " is not prime number"));
    }
    public static void main (String[] args) {
        for (int i = 2; i <= 100; i++) {
        PrimeNumber(i);
        }
    }
}
