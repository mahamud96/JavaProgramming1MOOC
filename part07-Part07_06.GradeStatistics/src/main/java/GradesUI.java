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
import java.util.ArrayList;

public class GradesUI {
    private GradeStatistics stats;
    private Scanner scanner;
    
    public GradesUI(GradeStatistics stats, Scanner scanner){
        this.stats = stats;
        this.scanner = scanner;
    }
    
    public void start(){
        appLoop();
        average();
        passingAverage();
        passPercentage();
        printGradeDistribution();
        
    }
    public void appLoop(){
        System.out.println("Enter point totals, -1 stops:");
        while(true){
            int grade = Integer.valueOf(scanner.nextLine());
            
            if(grade == -1){
                break;
            }
            
            this.stats.addPoint(grade);
        }
    }
    
    public void average(){
        double average = this.stats.getAvePoints(this.stats.getTotalPoints(), this.stats.numberOfAllPoints());
        System.out.println("Point average (all): " + average);
    }
    
    public void passingAverage(){
        double averagePassing = this.stats.getAvePoints(this.stats.getTotalPassingPoints(), this.stats.numberOfPassingPoints());
        if(averagePassing > 0){
            System.out.println("Point average (passing): " + averagePassing);
        } else {
            System.out.println("Point average (passing): -");
        }
    }
    
    public void passPercentage(){
        System.out.println("Pass percentage: " + this.stats.getPassPercentage());
    }
    
    public void printGradeDistribution() {
        int grade = 5;
        System.out.println("Grade distribution:");
        while (grade >= 0) {
            int stars = this.stats.numberOfAllGrades(grade);
            System.out.print(grade + ": ");
            printsStars(stars);
            System.out.println("");

            grade--;
        }
        
    }
    
    public static void printsStars(int stars) {
        while (stars > 0) {
            System.out.print("*");
            stars--;
        }
    }
    
    
    
}
