
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int found = 0;

        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        
        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();

        try(Scanner scan = new Scanner(Paths.get(file))){
            
            while(scan.hasNextLine()){
                if(scan.nextLine().equals(searchedFor)){
                    found++;
                    break;
                }
                
            }
        } catch(Exception ex){
            System.out.println("Reading the file " + file + " failed.");
            found += 2;
        }
        
        if(found == 1){
            System.out.println("Found!");
        } 
        if (found == 0){
            System.out.println("Not found.");
        }

    }
}
