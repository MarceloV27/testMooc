package Items;

import java.util.ArrayList;
import java.util.Scanner;

public class Items {

    public static void main(String[] args) {

        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // While loop to add a list for input names user.
        while(true){

            // User message and User input.
            System.out.print("Name: ");
            String name = scanner.nextLine();

            // User Exit the While loop if is empty input.
            if(name.isEmpty()){
                break;
            }

            // Add list of the names into ArrayList Object.
            items.add(new Item(name));
        }

        // Display the all names using For Loop.
        for(Item item:items){
            System.out.println(item);
        }


    }
}
