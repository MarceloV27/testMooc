package OneMinute;

public class Timer {

    private ClockHand oneForSecond;
    private ClockHand hundredthsOfASecond;

    public Timer() {
        this.oneForSecond = new ClockHand(60);
        this.hundredthsOfASecond = new ClockHand(100);
    }

    public void advance() {

        this.hundredthsOfASecond.advance();

        if(this.hundredthsOfASecond.value() == 0){
            this.oneForSecond.advance();
            if(this.oneForSecond.value() == 0){

            }
        }

    }



    public String toString() {
        return this.oneForSecond + ":" + this.hundredthsOfASecond;
    }

}
