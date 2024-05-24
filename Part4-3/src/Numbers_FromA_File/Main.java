package Numbers_FromA_File;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());

        ArrayList<Integer> numberList = new ArrayList<>();
        int count = 0;

        try(Scanner readerFile = new Scanner(Paths.get(file))){
            while(readerFile.hasNextLine()){
                String line = readerFile.nextLine();
                int number = Integer.valueOf(line);
                numberList.add(number);

                if (number >= lowerBound && number <= upperBound) {
                    count++;
                }
            }
        }catch(IOException e){
            System.out.println("Error " + e.getMessage());
        }
        System.out.println("Numbers: " + count);
    }
}
