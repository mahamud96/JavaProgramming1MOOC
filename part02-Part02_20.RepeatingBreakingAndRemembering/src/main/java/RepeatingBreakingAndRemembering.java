
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        
        /*
        Give numbers:
        5
        2
        4
        -1
        Thx! Bye!
        Sum: 11
        Numbers: 3
        Average: 3.666666666666
        Even: 2
        Odd: 1
        */
        
        Scanner scanner = new Scanner(System.in);
        
        int count = 0;
        int sum = 0;
        int odd = 0;
        int even = 0;
        
        System.out.println("Give numbers:");
        
        while(true){
            int num = Integer.valueOf(scanner.nextLine());
            
            if(num == -1){
                break;
            } else if(num % 2 == 0){
                even += 1;
            } else {
                odd +=1;
            }
            
            count += 1;
            sum += num;
        }
        if(count == 0){
            System.out.println("Thx! Bye!");
        } else {
            System.out.println("Thx! Bye!");
            System.out.printf("Sum: %s\n", sum);
            System.out.printf("Numbers: %s\n", count);
            System.out.printf("Average: %s\n", (sum/Double.valueOf(count)));
            System.out.printf("Even: %s\n", even);
            System.out.printf("Odd: %s\n", odd);
        }
        
        

    }
}
