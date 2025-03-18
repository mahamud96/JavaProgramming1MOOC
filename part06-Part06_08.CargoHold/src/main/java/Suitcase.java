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

public class Suitcase {
    private ArrayList<Item> list;
    private int maxWeight;
    
    public Suitcase(int maxWeight){
        this.list = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    public void addItem(Item item){
        int currentWeight = this.totalWeight();
        
        if(currentWeight + item.getWeight() <= this.maxWeight){
            this.list.add(item);
        }
    }
    
    public void printItems(){
        StringBuilder result = new StringBuilder();
        
        for(Item item:this.list){
            System.out.println(item);;
        }
    }
    
    public int totalWeight(){
        int totalWeight = 0;
        
        for(Item item:this.list){
            totalWeight += item.getWeight();
        }
        
        return totalWeight;
    }
    
    public Item heaviestItem(){
        if(this.list.isEmpty()){
            return null;
        }
        
        Item heaviestItem = new Item("",0);
        
        for(Item item:this.list){
            if(item.getWeight() > heaviestItem.getWeight()){
                heaviestItem = item;
            }
        }
        return heaviestItem;
    }
    
    @Override
    public String toString(){
        StringBuilder result = new StringBuilder();
        
        if(this.list.isEmpty()){
            result.append("no items");
        } else if(this.list.size() == 1){
            result.append(this.list.size() + " item");
        } else {
            result.append(this.list.size() + " items");
        }
        
        return result + " (" + this.totalWeight() + " kg)";
    }
    
}
