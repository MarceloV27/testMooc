package Printing_a_Specified_File;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fileName;

        fileName = scanner.nextLine();
        findFile(fileName);
    }

    public static void findFile(String fileName){
        try(Scanner readFileScanner = new Scanner(Paths.get(fileName))){
            while(readFileScanner.hasNextLine()){
                String readFile = readFileScanner.nextLine();
                System.out.println(readFile);
            }
        }catch(IOException e){
            System.out.println("Error " + e.getMessage());
        }

    }

}
