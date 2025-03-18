
import java.util.Scanner;

public class CarryOn {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = "";
        
        while(true){
            System.out.println("Shall we carry on?");
            word = scanner.nextLine();
            if (word.equals("no")){
                break;
            }
        }

    }
}
