package question2;

public class Main {
    public static void main(String[] args) {

        int[] numberList = {123,123,41,412,53,523,65,4567,345,12,543,63};

        int result = 0;

        for (int numberSum : numberList) result += numberSum;

        System.out.println("Your result is: " + result);
    }
}
