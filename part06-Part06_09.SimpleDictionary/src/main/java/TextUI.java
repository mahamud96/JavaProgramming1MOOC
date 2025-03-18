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

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dictionary;
    
    public TextUI(Scanner scanner, SimpleDictionary dictionary){
        this.scanner = scanner;
        this.dictionary = dictionary;
    }
    
    public void start(){
        while(true){
            System.out.print("Command: ");
            String word = this.scanner.nextLine();
            
            if(word.equals("end")){
                System.out.println("Bye bye!");
                break;
            }
            
            if(word.equals("add")){
                System.out.print("Word: ");
                String translate = this.scanner.nextLine();
                System.out.print("Translation: ");
                String translation = this.scanner.nextLine();
                
                this.dictionary.add(translate, translation);
                continue;
            }
            
            if(word.equals("search")){
                System.out.print("To be translated: ");
                String toBeTranslated = scanner.nextLine();
                String translation = dictionary.translate(toBeTranslated);
                if(translation == null){
                    System.out.println("Word " + toBeTranslated + " was not found");
                    continue;
                }
                System.out.println("Translation: " + translation);
                continue;
            }
            
            
            System.out.println("Unknown command");
        }
    }
    
}
