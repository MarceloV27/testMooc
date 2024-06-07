package question6;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Array
         String[] arrayString ={"HEy", "Como", "Estas ", "BEBE" };

        System.out.print("Enter a index to this array: "+ Arrays.toString(arrayString));
        // input
        int inputFineIndex = scanner.nextInt();

            if (inputFineIndex >= 0) {
                System.out.println(arrayString[inputFineIndex]);
            } else {
                System.out.println("Error");
            }
            scanner.close();
    }
}
