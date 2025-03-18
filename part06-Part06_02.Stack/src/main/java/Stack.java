
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


public class Stack {
    private ArrayList<String> list;
    
    public Stack(){
        this.list = new ArrayList<>();
    }
    
    public boolean isEmpty(){
        return list.isEmpty();
    }
    
    public void add(String value){
        this.list.add(0, value);
    }
    
    public ArrayList<String> values(){
        return this.list;
    }
    
    public String take(){
        return this.list.remove(0);
    }
    
}
