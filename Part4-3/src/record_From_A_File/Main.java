package record_From_A_File;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Name of the file:");
        System.out.println("");
        String fileName = scanner.nextLine();
        recordsFile(fileName);

    }


    public static void recordsFile(String filename){

        try(Scanner readFile = new Scanner(Paths.get(filename))){
            while(readFile.hasNextLine()){
                String file = readFile.nextLine();
                System.out.println(file);
            }




        }catch(IOException e){
            System.out.println(e.getMessage());
        }

    }

}
