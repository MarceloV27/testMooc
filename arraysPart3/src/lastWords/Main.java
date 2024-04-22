package lastWords;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while(scanner.hasNext()){

            // Input User
            String inputUser = scanner.nextLine();
            // Array
            String[] inputArray = inputUser.split(" ");
            //Exit
            if (inputUser.equals(" ")){
                break;
            }


            System.out.println(inputArray[inputArray.length-1]);
        }





    }
}
