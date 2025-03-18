
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            String sentence = scanner.nextLine();
            String[] wordArray = sentence.split(" ");
            
            if (sentence.equals("")) {
                break;
            } else {
                for(String word:wordArray){
                    System.out.println(word);
                }
            }
        }
    }
}
