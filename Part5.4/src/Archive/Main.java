package Archive;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Archive> list = new ArrayList();

        while(true){

            System.out.println("Identifier?(Empty will stop )");
            String identifier = scanner.nextLine();

            if(identifier.isEmpty()){
                break;
            }

            System.out.println("Name?(Empty will stop )");
            String name = scanner.nextLine();
            Archive archive = new Archive(identifier,name);

            if(list.contains(archive)){

            }else{
                list.add(archive);
            }

        }

        System.out.println("==Items==");
        for(Archive a : list){
            System.out.println(a);
        }

    }


}
