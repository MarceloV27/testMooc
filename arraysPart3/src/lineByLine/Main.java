package lineByLine;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String inputUser = scanner.nextLine();

            if (inputUser.equals("halted")){
                break;
            }

            String[] inputArray = inputUser.split(" ");

            for (int i = 0; i < inputArray.length; i++) {
            System.out.println(inputArray[i]);
            }
        }





    }
}
