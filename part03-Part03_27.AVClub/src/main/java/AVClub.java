
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            String string = scanner.nextLine();
            String[] words = string.split(" ");
            
            if(string.equals("")){
                break;
            }
            
            for(String word:words){
                if (word.contains("av")){
                    System.out.println(word);
                }
            }
        }


    }
}
