/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mahamud
 */
import java.util.ArrayList;

public class BirdWatchersDB {

    ArrayList<Birds> birdList;

    public BirdWatchersDB() {
        this.birdList = new ArrayList<>();
    }

    public void add(String birdName, String birdLatinName) {
        Birds bird = new Birds(birdName, birdLatinName);
        this.birdList.add(bird);
    }

    public void observation(String birdName) {
        if (this.birdFound(birdName) == false) {
            System.out.println("Not a bird!");
        }
        for (Birds bird : this.birdList) {
            if (bird.getName().equals(birdName)) {
                bird.addObserv();
            }
        }
    }

    public void getAllBirds() {
        for (Birds bird : this.birdList) {
            if (bird.getObservation() == 1) {
                System.out.println(bird.getName() + " (" + bird.getLatinName() + "): " + bird.getObservation() + " observation");
            }
            System.out.println(bird.getName() + " (" + bird.getLatinName() + "): " + bird.getObservation() + " observations");
        }
    }

    public void getOneBird(String birdName) {
        if (this.birdFound(birdName) == false) {
            System.out.println("Not a bird!");
        }
        for (Birds bird : this.birdList) {
            if (bird.getName().equals(birdName)) {
                if (bird.getObservation() == 1) {
                    System.out.println(bird.getName() + " (" + bird.getLatinName() + "): " + bird.getObservation() + " observations");
                }
                System.out.println(bird.getName() + " (" + bird.getLatinName() + "): " + bird.getObservation() + " observations");
            }
        }
    }

    public Boolean birdFound(String search) {
        for (Birds bird : this.birdList) {
            if (bird.getName().equals(search)) {
                return true;
            }
        }
        return false;
    }

}
