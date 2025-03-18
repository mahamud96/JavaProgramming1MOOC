
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> winners = new ArrayList<>();
        ArrayList<String> teams = new ArrayList<>();
        int teamCount = 0;
        int wins = 0;

        System.out.println("File:");
        String file = scan.nextLine();
               
        try(Scanner scanner = new Scanner(Paths.get(file))){
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                String[] split = line.split(",");

                String homeTeam = split[0];
                String awayTeam = split[1];

                teams.add(homeTeam);
                teams.add(awayTeam);
                
                int homeScore = Integer.valueOf(split[2]);
                int awayScore = Integer.valueOf(split[3]);
                
                MatchStats match = new MatchStats(homeTeam, awayTeam, homeScore, awayScore);
                winners.add(match.toSring());
                
                
            }
        } catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        
        System.out.println("Name:");
        String teamName = scan.nextLine();
        
        for(String team:teams){
            if(teamName.equals(team)){
            teamCount++;
            }
        }
                        
        for(String winner:winners){
            if(teamName.equals(winner)){
                wins++;
            }
        }
       
        System.out.println("Games: " + teamCount + " Wins: " + wins + " Losses: " + (teamCount - wins));

    }

}
