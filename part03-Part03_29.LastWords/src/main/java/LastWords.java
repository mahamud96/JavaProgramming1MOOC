
import java.util.Scanner;

public class LastWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            String string = scanner.nextLine();
            String[] words = string.split(" ");
            
            if(string.equals("")){
                break;
            }
            
            if(words.length > 0){
                System.out.println(words[words.length - 1]);
            }
        }


    }
}
