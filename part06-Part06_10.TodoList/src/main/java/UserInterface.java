
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mahamud
 */
public class UserInterface {
    private Scanner scanner;
    private TodoList todoList;
    
    public UserInterface(TodoList todoList, Scanner scanner){
        this.scanner = scanner;
        this.todoList = todoList;
    }
    
    public void start(){
        while(true){
            System.out.print("Command: ");
            String word = this.scanner.nextLine();
            
            if(word.equals("stop")){
                break;
            }
            
            if(word.equals("add")){
                System.out.print("To add: ");
                String item = this.scanner.nextLine();

                this.todoList.add(item);
                continue;
            }
            
            if(word.equals("list")){
                this.todoList.print();
                continue;
            }
            
            if(word.equals("remove")){
                System.out.print("Which one is removed? ");
                int item = Integer.valueOf(this.scanner.nextLine());
                this.todoList.remove(item);                
            }
        }
    }
    
}
