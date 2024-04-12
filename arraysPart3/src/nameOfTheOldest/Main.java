package nameOfTheOldest;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String oldestName = "";
        //New
        int ageMax = Integer.MIN_VALUE;

        //while LOOP
        while(true){
        String input = scanner.nextLine();

            if(input.isEmpty()){
                break;
            }

            String[] inputArray = input.split(",");
        // New
            String name = inputArray[0].trim();
            int age = Integer.parseInt(inputArray[1].trim());

        if(age >ageMax){
            ageMax = age;
            oldestName = name;

          }

        }
        System.out.println(" Name of the Oldest: " + oldestName);
        scanner.close();
    }

}
