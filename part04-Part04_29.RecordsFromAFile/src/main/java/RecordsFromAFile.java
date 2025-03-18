
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> ages = new ArrayList<>();
        ArrayList<String> names = new ArrayList<>();
        
        
        System.out.println("Name of the file:");
        String file = scanner.nextLine();
        
        try(Scanner scan = new Scanner(Paths.get(file))){
            while(scan.hasNextLine()){
                String line = scan.next();
                String[] split = line.split(",");
                
                int age = Integer.valueOf(split[1]);
                ages.add(age);
                String name = split[0];        
                names.add(name);
                
            }
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
        
        
        for(int i = 0; i < ages.size(); i++){
            System.out.print(names.get(i) + " age: " + ages.get(i));
            
            if(ages.get(i) == 1){
                System.out.println(" year");
            } else {
                System.out.println(" years");
            }
        }
        

    }
}
