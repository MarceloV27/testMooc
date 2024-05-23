package Guest_List_From_a_File;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {





    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        ArrayList<String> list = new ArrayList<>();
        // implement reading the file here.
        System.out.println("");

        String readFile = "";
        try (Scanner readScanner = new Scanner(Paths.get(file))) {
            while (readScanner.hasNextLine()) {
                readFile = readScanner.nextLine();
                System.out.println(readFile);
            }
        } catch (IOException e) {
            System.out.println("Error " + e.getMessage());
        }




        System.out.println("Enter names, an empty line quits.");


        while (true) {
            String name = scanner.nextLine();

            list.add(name);
            list.equals(readFile);

            if (name.isEmpty()) {
                break;
            }

            if (list.contains(name)) {
                System.out.println("The name is on the list.");

            } else {
                System.out.println("The name is not on the list.");
            }
        }

        System.out.println("Thank you!");
    }
}
