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

public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> list;
    
    public Hold(int maxWeight){
        this.maxWeight = maxWeight;
        this.list = new ArrayList<>();
    }
    
    public void addSuitcase(Suitcase suitcase){
        int currentWeight = 0;
        for(Suitcase item:list){
            currentWeight += item.totalWeight();
        }
        if(currentWeight + suitcase.totalWeight() <= this.maxWeight){
            this.list.add(suitcase);
        }        
    }
    
    public void printItems(){
        for(Suitcase item:this.list){
            item.printItems();
        }
    }
    
    @Override
    public String toString(){
        int totalSuitcasesWeight = 0;
        for(Suitcase item:this.list){
            totalSuitcasesWeight += item.totalWeight();
        }
        
        return this.list.size() + " suitcases (" + totalSuitcasesWeight + " kg)";
    }
    
}
