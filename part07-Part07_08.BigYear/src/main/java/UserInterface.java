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

    private BirdWatchersDB birdList;
    private Scanner scan;

    public UserInterface(BirdWatchersDB birdList, Scanner scan) {
        this.birdList = birdList;
        this.scan = scan;
    }

    public void start() {
        while (true) {
            System.out.print("? ");
            String command = scan.nextLine();
            
            if(command.equals("Quit")){
                break;
            }

            if (command.equals("Add")) {
                System.out.print("Name: ");
                String birdName = scan.nextLine();
                System.out.print("Name in Latin: ");
                String birdLatinName = scan.nextLine();
                this.birdList.add(birdName, birdLatinName);
            }

            if (command.equals("Observation")) {
                System.out.print("Bird: ");
                String birdName = scan.nextLine();
                this.birdList.observation(birdName);
            }
            
            if (command.equals("All")){
                this.birdList.getAllBirds();
            }
            
            if(command.equals("One")){
                System.out.print("Bird: ");
                String birdName = scan.nextLine();
                this.birdList.getOneBird(birdName);
            }

        }

    }

    

    

}
