package school.mjc.stage0.loops.task2;

public class EvenNumbersPrinter {
    public void printEvenNumbers(int printTillInclusive) {
        int begin = 0;
        while (begin <= printTillInclusive) {
            System.out.println(begin);
            begin += 2;
        }
    }
}
