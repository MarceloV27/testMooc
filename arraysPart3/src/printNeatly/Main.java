package printNeatly;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // You can test your method here
        int[] array = {5, 1, 3, 4, 2};
        printNeatly(array);
    }

    public static int printNeatly(int[] array) {
        // Write some code in here

       int index = 0;
        int numberList = 0;
        for (int i = index; i < array.length; i++) {
            numberList = array[i];

            if(i < array.length -1){
                System.out.print(numberList+ ", ");
            }else{
                System.out.println(numberList);
            }

        }

       return 0;
    }


}
