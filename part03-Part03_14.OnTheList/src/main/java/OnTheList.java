
import java.util.ArrayList;
import java.util.Scanner;

public class OnTheList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            list.add(input);
        }
        
        System.out.print("Search for? ");
        String name = scanner.next();
        boolean found = false;
        
        
        for(String item:list){
            if(item.equals(name)){
                System.out.println(name + " was found!");
                found = true;
            }
        }
        
        if(found == false){
            System.out.println(name + " was not found!");
        }

    }
}
