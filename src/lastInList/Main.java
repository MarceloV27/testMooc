package lastInList;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();

        while (true) {

            //Exit
            String input = scanner.nextLine();

            if (input.equals("")) {

                int index = list.size() - 1;
                String lastDigit = list.get(index);

                System.out.println(lastDigit);
                break;
            }
            
            // Add list
            list.add(input);


        }



    }

}
