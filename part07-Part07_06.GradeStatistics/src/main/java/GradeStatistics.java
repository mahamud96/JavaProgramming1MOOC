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

public class GradeStatistics {
    private ArrayList<Integer> allPoints;
    private ArrayList<Integer> grades;
    
    
    public GradeStatistics(){
        this.allPoints = new ArrayList<>();
        this.grades = new ArrayList<>();
    }
    
    public void addPoint(int point){
        if(point >= 0 && point <= 100){
            this.grades.add(pointsToGrades(point));
            this.allPoints.add(point);
        }
    }
    
    public int numberOfAllGrades(int grade){
        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }
        return count;
    }
    
    public int numberOfAllPoints(){
        return this.allPoints.size();
    }
    
    public int numberOfPassingPoints(){
        int count = 0;
        for(int point:this.allPoints){
            if(point >= 50){
                count++;
            }
        }
        return count;
    }
    
    public int getTotalPoints(){
        int total = 0;
        for(int point:this.allPoints){
            total += point;
        }
        return total;
    }
    
    public int getTotalPassingPoints(){
        int total = 0;
        for(int point:this.allPoints){
            if(point >= 50){
                total += point;
            }
        }
        return total;
    }
    
    public double getAvePoints(int totalPoints, int numOfPoints){
        return (1.0 * totalPoints)/numOfPoints;
    }
    
    public double getPassPercentage(){
        return (1.0 * this.numberOfPassingPoints())/this.numberOfAllPoints()*100;
    }
    
    
    
    public static int pointsToGrades(int points) {

        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }
}
