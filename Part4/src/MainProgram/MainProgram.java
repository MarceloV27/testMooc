package MainProgram;

import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {

        // I can not type two object in the main method.
        // I thing I need to delete Statistics Obejct.
        // Check it =)
      /*  Scanner scanner = new Scanner(System.in);



        System.out.println("Enter numbers");
       while(true){
           int inputUser = scanner.nextInt();



       }*/

        Statistics statistics = new Statistics();

        statistics.addNumber(3);
        statistics.addNumber(5);
        statistics.addNumber(1);
        statistics.addNumber(2);

        System.out.println("Count: " + statistics.getCount());
        System.out.println("Sum: " + statistics.sum());
        System.out.println("Average: " + statistics.average());
    }
}