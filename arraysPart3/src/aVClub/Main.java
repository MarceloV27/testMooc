package aVClub;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(scanner.hasNext()){

            String inputUser = scanner.nextLine();

            String[] inputArray = inputUser.split(" ");



            for (int i = 0; i < inputArray.length; i++){
               // System.out.println(inputArray[i]);

                if (inputArray[i].contains("av")){
                    System.out.println(inputArray[i]);
                }

            }
        }

    }

}
