package TelevisionPrograms;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // DurationMax variable initialize
         int durationMax= 0;

         //Enter the While Loop
        while(true){

            // Ask User program's name.
            System.out.print("Name:");
            String programName = scanner.nextLine();

            // Exit the While Loop and ask user program's maximum duration.
            if(programName.isEmpty()){
                System.out.print("Program's maximum duration?");
                 durationMax = scanner.nextInt();
                break;
            }

            // Ask the program's duration.
            System.out.print("Duration:");
            int durationPrograms = Integer.parseInt(scanner.nextLine());

            // Add in Arraylist object's variable.
            programs.add(new TelevisionProgram(programName, durationPrograms));
        }
        // Finish While loop


        // For loop
        // If statement compare to duration(variable) are less than or equal durationMax(variable)
        for(TelevisionProgram program : programs)
            if (program.getDuration() <= durationMax) {
                System.out.println(program.getName() + ", " + program.getDuration() + " minutes");
            }
    }
}
