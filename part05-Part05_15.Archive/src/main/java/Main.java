
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Archive> archives = new ArrayList<>();
        
        while(true){
            System.out.println("Identifier? (empty will stop)");
            String identifier = scanner.nextLine();
            
            if(identifier.equals("")){
                break;
            }
            
            System.out.println("Name? (empty will stop)");
            String name = scanner.nextLine();
            
            if(name.equals("")){
                break;
            }
            
            Archive archive = new Archive(identifier, name);
            
            if(!(archives.contains(archive))){
                archives.add(archive);
            } 

        }
        
        for(Archive item:archives){
            System.out.println(item);
        }


    }
}
