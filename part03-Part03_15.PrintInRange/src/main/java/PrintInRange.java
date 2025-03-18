
import java.util.ArrayList;

public class PrintInRange {

    public static void main(String[] args) {
        // Try your method here
        
    }
    
    public static void printNumbersInRange(ArrayList<Integer> list, int lowerLimit, int upperLimit){
        for(int number:list){
            if(number <= upperLimit && number >= lowerLimit){
                System.out.println(number);
            }
        }
    }
    
}
