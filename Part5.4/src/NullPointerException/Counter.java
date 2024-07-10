package NullPointerException;

public class Counter {

    private int startValue;

    public Counter(int startValue) {
        this.startValue = startValue;
    }

    public Counter() {
        this.startValue = 0;
    }

    public int value() {
        return this.startValue;
    }

    public void increase() {
        this.startValue++;
    }

    public void decrease() {
        this.startValue--;
    }

    public void increase(int increaseBy) {

        if (increaseBy > 0) {
            this.startValue = this.startValue + increaseBy;
        }

        if (increaseBy <= -1) {
            this.startValue = this.startValue;

        }

    }

    public void decrease(int decreaseBy) {

        if (decreaseBy > 0) {
            this.startValue = this.startValue - decreaseBy;

        }

        if (decreaseBy <= -1) {
            this.startValue = this.startValue;

        }

    }

}
