
import java.util.Scanner;
import java.util.ArrayList;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList();
        
        while(true){
            String string = scanner.nextLine();
            String[] split = string.split(",");
            
            if(string.equals("")){
                break;
            }
            
            list.add(Integer.valueOf(split[split.length - 1]));   
        }
        
        int oldest = 0;
        for(int item:list){
            if(item > oldest){
                oldest = item;
            }
        }
        
        System.out.println("Age of the oldest: " + oldest);


    }
}
