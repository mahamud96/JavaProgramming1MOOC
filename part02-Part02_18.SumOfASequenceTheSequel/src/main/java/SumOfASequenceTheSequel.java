
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int sum = 0;
        
        System.out.print("First number? ");
        int num1 = Integer.valueOf(scanner.nextLine());
        System.out.print("Second number? ");
        int num2 = Integer.valueOf(scanner.nextLine());
        
        for(int i = num1; i <= num2; i++){
            sum += i;
        }
        
        System.out.printf("The sum is %s", sum);

    }
}
