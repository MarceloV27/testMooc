package rememberTheseNumbers;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            ArrayList<Integer> numbers = new ArrayList<>();

            while (true) {

                int luku = Integer.valueOf(scanner.nextLine());

                //Exit
                if (luku == -1) {

                    System.out.println(numbers);

                    break;
                }



                numbers.add(luku);
            }

        }

}
