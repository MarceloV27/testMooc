package Statistics;

public class Statistics {

    private int count;
    private int sum;


    public Statistics() {
        // initialize the variable numberCount here

    }

    public void addNumber(int number) {
        // write code here

        sum  = sum + number;
        count++;
    }

    public int getCount(){
        // write code here
        return count;
    }


    public int sum() {
        // write code here
        return sum ;
    }

    public double average() {
        // write code here

        if(count == 0){

            return 0;

        }
        return (double)sum/count;
    }



}