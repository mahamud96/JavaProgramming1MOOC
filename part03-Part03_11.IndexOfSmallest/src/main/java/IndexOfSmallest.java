
import java.util.ArrayList;
import java.util.Scanner;

public class IndexOfSmallest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // implement here a program that reads user input
        // until the user enters 9999
        
        // after that, the program prints the smallest number
        // and its index -- the smallest number
        // might appear multiple times
        
        ArrayList<Integer> list = new ArrayList<>();
        int smallest = 9999;

        while(true){
            int num = Integer.valueOf(scanner.nextLine());
            if(num == 9999){
                break;
            }
            
            list.add(num);
        }
        
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) < smallest){
                smallest = list.get(i);
            }
        }
        
        System.out.println("Smallest number: " + smallest);
        
        for(int j = 0; j < list.size(); j++){
            if(list.get(j) == smallest){
                System.out.println("Found at index: " + j);
            }
        }
        
        
        
    }
}
