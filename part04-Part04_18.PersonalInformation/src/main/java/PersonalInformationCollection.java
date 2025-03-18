
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class

        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            System.out.print("First name: ");
            String fname = scanner.nextLine();
            
            if(fname.equals("")){
                break;
            }
            
            System.out.print("Last name: ");
            String lname = scanner.nextLine();
            System.out.print("Identification number: ");
            String idNum = scanner.nextLine();
            
            PersonalInformation person = new PersonalInformation(fname, lname, idNum);
            
            infoCollection.add(person);
        }
        System.out.println("");
        for(PersonalInformation item:infoCollection){
            System.out.println(item.getFirstName() + " " + item.getLastName());
        }

    }
}
