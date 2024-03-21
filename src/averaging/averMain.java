package averaging;

public class averMain {

    // implement the sum method here again
    public static int sum(int number1, int number2, int number3, int number4) {
        // write some code here
        return 0;
    }

    public static double average(double number1, double number2, double number3, double number4) {
        //write some code here
        double sum = number1 + number2 + number3 + number4;
        double averResult = sum/4;
        return averResult;
    }

    public static void main(String[] args) {
        double result = average(4, 3, 6, 1);
        System.out.println("Average: " + result);
    }

}
