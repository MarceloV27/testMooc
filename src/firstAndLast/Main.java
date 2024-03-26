package firstAndLast;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        ArrayList<String> list = new ArrayList<>();


        //Exit
        while (true) {



            String input = scanner.nextLine();
            if (input.equals("")) {
                int index = list.size() -1 ;

                System.out.println(index);

                break;
            }


            list.add(input);
        }
    }
}
