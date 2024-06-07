package question7;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] array = {123, 123, 1234, 512, 54435, 152};

        System.out.println("Original Array: " + Arrays.toString(array));

        int removeIndex = 1;

        for (int i = removeIndex; i < array.length-1; i++) {
            array[i] = array[i + 1];
        }

        System.out.println("After remove the second element: " + Arrays.toString(array));

    }
}
