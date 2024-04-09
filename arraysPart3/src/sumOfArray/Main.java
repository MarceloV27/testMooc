package sumOfArray;

public class Main {

    public static void main(String[] args) {
        // You can try the method here
        int[] array = {5, 1, 3, 4, 2};
        System.out.println(sumOfNumbersInArray(array));
    }

    public static int sumOfNumbersInArray(int[] array) {
        // Write some code here

        int result =0;
        int index = 0;
        for (int i = index;i<array.length;i++){
            int numberList = array[i];
            result +=numberList;
        }
        return result;
    }


}
