package NullPointerException;

public class Main {
    public static void main(String[] args) {

        Counter counterNew = new Counter();
        counterNew = new Counter(1);

        Counter counterOld = counterNew;
        counterOld.increase();
        counterOld.increase();
        counterOld.increase();

        System.out.println(counterOld);

        counterNew = null;
        counterNew.decrease();
    }
}
