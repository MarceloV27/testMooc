package decreasingCounter;

public class DecreasingCounter {

    private int value;  // an object variable for storing the value of the counter

    public DecreasingCounter(int initialValue) {
        this.value = initialValue;
    }

    public void printValue() {
        // Do not change this code!
        System.out.println("value: " + this.value);
    }

    public void decrement() {
        // write the method implementation here
        // the aim is to decrement the value of the counter by one

        if(this.value >= 1){
            // Couter
            this.value--;

        }else if (this.value <= 0 ){
            this.value*=0;

        }else{
            System.out.println("Error, try again");
        }

    }

    // the other methods go here
    public void reset(){
    if(this.value >= 1 ){
        this.value*=0;
    }

    }
}
