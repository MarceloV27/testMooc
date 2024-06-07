package Statistics;

import java.util.Scanner;

public class MainProgram {









    public static void main(String[] args) {

        // scanner Object.
        Scanner scanner = new Scanner(System.in);

        // statistics Object To sums all the numbers.
        Statistics statisticsSumAll = new Statistics();

        // statistics Object To sums the even numbers.
        Statistics statisticsEven = new Statistics();

        // statistics Object to sums the odd numbers.
        Statistics statisticsOdd = new Statistics();


        // Message User.
        System.out.println("Enter numbers: ");

        // Initialize variable.
        int inputUser = 0;

        // While loop.
       while(inputUser >= 0){

            // Ask Input User.
            inputUser = scanner.nextInt();

           //Collection.

           // Statistics Object Sum All.
           if(inputUser >= 0){
               statisticsSumAll.addNumber(inputUser);
           }

            // Statistics Object Only Even Numbers.
         if(inputUser % 2 == 0){
             statisticsEven.addNumber(inputUser);
         }

         // Statistics Object Only Odd Numbers.
         if(inputUser % 2 == 1){
             statisticsOdd.addNumber(inputUser);
         }

       }

        //  Exited While loop and display the sum's results.
            System.out.println("Sum: " + statisticsSumAll.sum());
            System.out.println("Sum of even numbers: " + statisticsEven.sum());
            System.out.println("Sum of odd numbers: " + statisticsOdd.sum());





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