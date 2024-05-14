package personalInformation;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);


        // Enter the While loop
        while(true){

            // User Message and User (Data type: String) input into firstName variable.
            System.out.print(" First Name: ");
            String firstName = scanner.nextLine();

            // Exit the While loop and User Input "Press Enter key" with nothing in the program.
            if(firstName.isEmpty()){
                break;
            }

            // User Message and User (Data type: String) input into LastName variable.
            System.out.print("Last Name: ");
            String lastName = scanner.nextLine();

            // User Message and User (Data type: String) input into identificationNumber variable.
            System.out.print("Identification number: ");
            String identificationNumber = scanner.nextLine();

            // Add User input variable into a ArrayList.
            infoCollection.add(new PersonalInformation(firstName, lastName, identificationNumber ));

        }

        // For Loop outside the "While Loop" and print the User Input with different format.
        for( PersonalInformation personInfo:infoCollection){

            System.out.println(" ");
            System.out.print( personInfo.getFirstName() );
            System.out.print(" ");
            System.out.print(personInfo.getLastName());
        }






    }
}
