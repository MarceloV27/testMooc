package sportStatistics;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try{
            Scanner scanner = new Scanner(System.in);
            System.out.println("File:");
            System.out.print("");
            String fileName = scanner.nextLine();
            System.out.println("Team:");
            System.out.print("");
            String gamesTeam = scanner.nextLine();
            readfile(fileName, gamesTeam);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

    }// Hello Hello
    public static void readfile(String fileName, String gamesTeam){

        int count = 0, wins = 0, losses = 0;

        try(Scanner fileReader = new Scanner(Paths.get(fileName))){
            String data;
            while(fileReader.hasNextLine()){
                data = fileReader.nextLine();

                if (data.contains(gamesTeam)) {
                    String[] parts = data.split(",");
                    int scoreTeam1 = Integer.parseInt(parts[2].trim());
                    int scoreTeam2 = Integer.parseInt(parts[3].trim());

                    if (data.contains(gamesTeam) && data.contains("SJ")) {
                        wins++;
                    } else if (scoreTeam1 < scoreTeam2) {
                        wins++;
                    } else {
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
