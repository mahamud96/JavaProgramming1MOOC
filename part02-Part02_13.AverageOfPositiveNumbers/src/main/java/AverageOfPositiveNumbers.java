
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double sum = 0;
        double count = 0;
        
        while(true){
            int num = Integer.valueOf(scanner.nextLine());
            
            if(num == 0){
                break;
            } else if (num > 0){
                sum += num;
                count += 1;
            } else {
                continue;
            }
        }
        
        if(sum == 0){
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println(sum/count);
        }

    }
}
