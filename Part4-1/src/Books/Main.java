package Books;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // ArrayList's object and Scanner.
        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Global variable.
        String information = " ";
        String everything = "everything";
        String  name = "name";
        String pages = "pages";
        String year = "year";

        // Enter the loop.
        while(true){

            // User input book's title.
            System.out.print("Title:");
            String title = scanner.nextLine();

            // Exit the loop and User Input request information.
            if(title.isEmpty()){
                System.out.println("What information will be printed");
                information = scanner.nextLine();
                break;
            }

            // User input book's Pages.
            System.out.print("Pages:");
            int Pages = Integer.parseInt(scanner.nextLine());

            // User input book's Publication Year.
            System.out.print("Publication year:");
            int publicationYear = Integer.parseInt(scanner.nextLine());

            // ArrayList 's Object (Book addition)
            books.add(new Book(title, Pages, publicationYear));
        }
        // Finish While loop

        // For loop to display for the User request
        for(Book book : books){

            if(information.equals(everything)){
                System.out.println(book);
            }else if(information.equals(name)){
                System.out.println(book.getTitle());
            }else if(information.equals(pages)){
                System.out.println(book.getPages());
            }else if(information.equals(year)){
                System.out.println(book.getPublicationYear());
            }else{
                System.out.println("Error");
            }

        }

    }

}
