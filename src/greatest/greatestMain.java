package greatest;

public class greatestMain {


    public static int greatest(int number1, int number2, int number3) {
        //write some code here

        int max = Math.max(number1,number2);
        int result = Math.max(max, number3);
        return result;
    }

    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }


}
