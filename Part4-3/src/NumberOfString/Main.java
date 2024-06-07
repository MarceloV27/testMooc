package NumberOfString;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        while(true){

              String word = scanner.nextLine();

            if(word.equals("end")){

                System.out.println(list.size());
                break;
            }

            list.add(word);
        }

    }
}
