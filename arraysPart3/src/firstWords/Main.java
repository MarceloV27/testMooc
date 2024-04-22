package firstWords;
import java.security.Signature;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while(scanner.hasNext()){

            // Input User
            String inputUser = scanner.nextLine();
            //Array
            String[] inputArray = inputUser.split(" ");
            // Print
            System.out.println(inputArray[0]);

            // Exit Program
            if(inputUser.equals(" ")){
                break;
            }
        }
    }


}
