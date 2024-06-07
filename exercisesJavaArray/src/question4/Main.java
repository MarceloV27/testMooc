package question4;

public class Main {
    public static void main(String[] args) {

        double[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

        double result =0;
        for (double number : numbers) {
            result += number;
        }
        System.out.println(result/numbers.length);
    }
}
