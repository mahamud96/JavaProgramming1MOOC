/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mahamud
 */
public class Birds {
    private String name;
    private String latinName;
    private int observation;
    
    public Birds(String name, String latinName){
        this.name = name;
        this.latinName = latinName;
        this.observation = 0;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getLatinName(){
        return this.latinName;
    }
    
    public int getObservation(){
        return this.observation;
    }
    
    public void addObserv(){
        this.observation++;
    }
    
    
}
