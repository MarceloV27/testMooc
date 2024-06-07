package DecreasingCounter;

public class DecreasingCounter {

    private int value;  // an object variable for storing the value of the counter

    public DecreasingCounter(int initialValue){
        this.value = initialValue;
    }

    public void printValue() {
        // Do not change this code!
        System.out.println("value: " + this.value);
    }

    public void decrement() {
        // write the method implementation here
        // the aim is to decrement the value of the counter by one

        if(this.value == 0 || this.value >= 1){
            // Couter
            for(int i = 0; this.value >= i; this.value--){

            }
        }else{
            System.out.println("Enter a positive number, Try again");
        }

    }
    // the other methods go here
   /* public void reset(){

        if(this.value == 0){

            // Couter
            this.value--;
        }else{
            System.out.println("Enter a positive number, Try again");
        }

    }*/
}
