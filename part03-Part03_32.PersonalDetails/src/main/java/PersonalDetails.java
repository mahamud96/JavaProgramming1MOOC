
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double average = 0.00;
        int counter = 0;
        String longestName = "";
        
        while(true){
            String string = scanner.nextLine();
            String[] split = string.split(",");
            
            if(string.equals("")){
                break;
            }
            
            String name = split[0];
            if(name.length() > longestName.length()){
                longestName = name;
            }
            
            average += Integer.valueOf(split[1]);
            counter++;
        }
        
        average /= counter;
        
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + average);
    }
}
