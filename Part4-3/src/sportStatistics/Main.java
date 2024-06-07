package sportStatistics;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {

     public static String fileName;
     public static String gamesTeam;

    public static void main(String[] args) {

        try{
            Scanner scanner = new Scanner(System.in);
            System.out.println("File:");
            System.out.print("");
             fileName = scanner.nextLine();
            System.out.println("Team:");
            System.out.print("");
             gamesTeam = scanner.nextLine();
            readfile(fileName, gamesTeam);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

    }

    public static void readfile(String fileName, String gamesTeam){

        int count = 0, wins = 0, losses = 0;

        try(Scanner fileReader = new Scanner(Paths.get(fileName))){
            while(fileReader.hasNextLine()){
               String data = fileReader.nextLine();
                String[] parts = data.split(",");

                if(data.contains(gamesTeam)){

                    int team1 = Integer.parseInt(parts[2].trim()) ;

                    if(data.contains(gamesTeam) && data.contains("SJ")){
                        wins++;
                    }else if(team1 == 16){
                        wins ++;
                    }else {
                        losses++;
                    }
                    count++;
                }

            }

        }catch(IOException e){
            System.out.println("error reading file");
        }
            System.out.println("Game: " + count);
            System.out.println("Wins: " + wins);
            System.out.println("Losses: " + losses);
    }


}
