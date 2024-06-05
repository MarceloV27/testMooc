package storingRecords;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Filename:");
        String file = scan.nextLine();

        ArrayList<Person> records = readRecordsFromFile(file);
        System.out.println("Persons: " + records.size());
        System.out.println("Persons:");
        for (Person person : records) {
            System.out.println(person);

        }
    }

    public static ArrayList<Person> readRecordsFromFile(String file) {
        ArrayList<Person> persons = new ArrayList<>();

        // Write here the code for reading from file
        // and printing the read records

        try(Scanner readFile = new Scanner(Paths.get(file))){

            while(readFile.hasNextLine()){
                String fileName = readFile.nextLine();

                String[] parts = fileName.split(",");
                String name = parts[0];
                int age = Integer.parseInt(parts[1]);
                persons.add(new Person(name, age));
            }

        }catch(IOException e){
            System.out.println(e.getMessage());
        }






        return persons;

    }
}
