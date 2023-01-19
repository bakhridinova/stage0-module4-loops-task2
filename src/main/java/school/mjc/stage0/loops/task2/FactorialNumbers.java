package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int factorial = 1;
        int product = 1;
        while (factorial < printToInclusive + 2) {
            System.out.println(product);
            product *= factorial;
            factorial++;
        }
    }
}
