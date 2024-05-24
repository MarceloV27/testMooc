package Is_it_in_the_file;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();

        ArrayList<String> namesList = new ArrayList<>();

            try (Scanner readNames = new Scanner(Paths.get(file))) {
                while (readNames.hasNextLine()) {
                    String line = readNames.nextLine();
                    namesList.add(line);
                }

                if(namesList.contains(searchedFor)){
                    System.out.println("Found!");
                }else{
                    System.out.println("Not found!");
                }

            } catch (IOException e) {
                System.out.println("Reading the file " + file + " failed.");

            }

    }
}
