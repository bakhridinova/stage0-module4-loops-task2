package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int count = 2;
        while (count <= printToInclusive) {
            if (isPrime(count)) {
                System.out.println(count);
            }
            count++;
        }
    }

    private boolean isPrime(int number) {
        int divisors = 0;
        int count = 1;
        while (count <= number) {
            if (number % count == 0) {
                divisors++;
            }
            count++;
        }
        return divisors == 2;
    }
}
