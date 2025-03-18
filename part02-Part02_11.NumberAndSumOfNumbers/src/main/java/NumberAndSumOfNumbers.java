
import java.util.Scanner;

public class NumberAndSumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int count = 0;
        int sum = 0;
        
        while (true){
            System.out.println("Give a number:");
            int num = Integer.valueOf(scanner.nextLine());
            
            if(num == 0){
                break;
            } else {
                count += 1;
                sum += num;
            }
        }
        
        System.out.println("Number of numbers: " + count + "\n" + "Sum of the numbers: " + sum);

    }
}
