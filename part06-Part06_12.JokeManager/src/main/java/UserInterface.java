/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mahamud
 */
import java.util.Scanner;

public class UserInterface {
    private JokeManager manager;
    private Scanner scanner;
    
    public UserInterface(JokeManager manager, Scanner scanner){
        this.manager = manager;
        this.scanner = scanner;
    }
    
    public void start(){
        while(true){
            System.out.println("Commands:\n1 - add a joke\n2 - draw a joke\n3 - list jokes\nX - stop");
            String choice = scanner.nextLine();
            
            if(choice.equals("X") || choice.equals("x")){
                break;
            }
            
            if(choice.equals("1")){
                System.out.println("Write the joke to be added:");
                String joke = scanner.nextLine();
                
                this.manager.addJoke(joke);
                continue;
            }
            
            if(choice.equals("2")){
                System.out.println(this.manager.drawJoke());
            }
            
            if(choice.equals("3")){
                this.manager.printJokes();
            }
        }
    }
    
}
