package decreasingCounter;

public class Main {
    public static void main(String[] args) {

        DecreasingCounter counter = new DecreasingCounter(5);

        counter.printValue();

        counter.decrement();
        counter.printValue();

        counter.decrement();
        counter.printValue();

        counter.decrement();
        counter.printValue();
    }
}
