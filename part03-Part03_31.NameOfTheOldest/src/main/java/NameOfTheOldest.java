
import java.util.Scanner;
import java.util.ArrayList;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> age = new ArrayList<>();
        ArrayList<String> name = new ArrayList<>();
        
        while(true){
            String string = scanner.nextLine();
            String[] split = string.split(",");
            
            if(string.equals("")){
                break;
            }
            
            age.add(Integer.valueOf(split[split.length - 1]));
            name.add(split[0]);
        }
        
        int oldest = 0; 
        for(int each:age){
            if(each > oldest){
                oldest = each;
            }
        }
        
        int index = 0;
        while(index < age.size()){
            if(oldest == age.get(index)){
                break;
            }
            index++;
        }
        System.out.println("Name of the oldest: " + name.get(index));
    }
}
